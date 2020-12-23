
package travel_._tourism;
import java.sql.*;
import java.sql.DriverManager;

public class conn
{    Connection c;
     Statement s;
    
    public conn()
    {   
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs","root","root");
            s=c.createStatement();
            
        }
        catch(Exception e)
        {
            
        }
   
    }
    public static void main(String ar[])
    {
       conn c= new conn();
    }
}
