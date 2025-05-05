
package SpartainExpenseTracker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author royperlman
 */
public class ConnectingToDataBase 
{
  private static String url = "jdbc:h2:~/test"+System.getProperty("user.dir") + "\\db\\ia";  
  private static String driverName = "org.h2.Driver";
  private static String username = "intact";
  private static String password = "abode";
  private static Connection connection;
  private static String urlstring;
  
  
  public static Connection getConnection()
  {
      try
      {
          Class.forName(driverName);
          
          try
          {
              connection = DriverManager.getConnection(url, username, password);
              System.out.println("Connection is Sucessfull");
          }
          catch(SQLException ex)
          {
              System.out.println("Connection is Unsucessfull");
              ex.printStackTrace();
          }
      }
      catch(ClassNotFoundException ex)
      {
          System.out.println("Driver not found.");
      }
      return connection;
  }
 
  public static void main(String[] args)
  {
      getConnection();
      System.out.println("Opening...");
      System.out.println(url);
  } 
}
