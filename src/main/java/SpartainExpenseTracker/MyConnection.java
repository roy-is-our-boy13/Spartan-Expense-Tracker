package SpartainExpenseTracker;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection 
{
    public static Connection getConnection()
    {
        Connection con = null;
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javacibtactsapp","root","");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
