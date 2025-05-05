
package SpartainExpenseTracker;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author royperlman
 */
public class DataStorage 
{
    private static final String filename = "UserProfileDataBasee.txt";

    private static HashMap<String, UserData> users = new HashMap<String, UserData>();
 
    public static UserData getUser(String StudentID)
    {
        return users.get(StudentID);
    }
    
    public static boolean StoreUser(String studentId, String firstName, String middleName, String lastName,
            String createPassword, String confirmPassword ) 
    {
        
        if(studentId.equals("") || firstName.equals("") &&  middleName.equals(" ") && lastName.equals("") ||
                createPassword.equals(" ") || confirmPassword.equals(" ") )
        {
            System.out.println("Passing...");
            return false;
        }
     
        if(!createPassword.equals(confirmPassword))
        {
            return false;
        }
       
        if (users.containsKey(studentId))
        {
            return false;
        }
        
        if(!studentId.matches("[0-9]+") || studentId.length() != 9)
        {
            System.out.println("This IS NOT a valid student ID. Please try again.");
            return false;
        }
        
        users.put(studentId, new UserData(studentId, createPassword, firstName, middleName, lastName ));
        return true;
    }

    public static boolean CheckPassword(String studentId, String createPassword)
    {
        if(studentId.equals("") || createPassword.equals(""))
        {
            return false;
        }
         
        if (!users.containsKey(studentId))
        { 
            return false;
        }
        
        return (users.get(studentId).Password.equals(createPassword));
    }

    public static boolean ChangeSettings( String firstName, String middleName, String lastName,
            String oldPassword, String createPassword, String confirmPassword)
    {

        UserData.currentUser.FirstName = firstName;
        UserData.currentUser.MiddleName = middleName;
        UserData.currentUser.LastName = lastName;
        UserData.currentUser.Password = createPassword;
        
        if(firstName.equals("") && middleName.equals("")  &&  lastName.equals("") ||
           oldPassword.equals(" ")|| createPassword.equals(" ") || confirmPassword.equals(" "))
        {
            
            return false;
        }
     
        if(!createPassword.equals(confirmPassword))
        {
            return false;
        }
    
        users.put(UserData.currentUser.ID, new UserData(oldPassword, UserData.currentUser.Password, 
        UserData.currentUser.FirstName, UserData.currentUser.MiddleName, UserData.currentUser.LastName));
        return true;
    }
    
    public static void SaveData() 
    {
        try
        {
           FileOutputStream FOS = new FileOutputStream(filename);
           ObjectOutputStream OOS = new ObjectOutputStream(FOS);
           OOS.writeObject(users);
           OOS.close();
           FOS.close();
        } 
        catch (IOException e) 
        {
            System.out.println("There was an error saving the data.");
        }
    }

    public static void LoadData() 
    {
        try 
        {
           FileInputStream FIS = new FileInputStream(filename);
           ObjectInputStream OIS = new ObjectInputStream(FIS);
           users = (HashMap) OIS.readObject();
           OIS.close();
           FIS.close();
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DataStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
