package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Database_Connection {
    
     public static String URL = "jdbc:mysql://10.123.0.165:3306/gamabasis_p3g7";
    public static String user = "gamabasis_p3g7";
    public static String password = "D8DX06yfj#";

    public Connection connection_;
    PreparedStatement ps;
    ResultSet rs;
    
    public Database_Connection(){
    
        Connection _connection = getConnection();
    }
    
    public Connection getConnection(){
    
        connection_ = null;
        
        try{
        
            connection_ = DriverManager.getConnection(URL, user, password);
            System.out.println("Successful Connection");
            JOptionPane.showMessageDialog(null, "EY LISTEN");
            
        }catch(Exception ex){
        
            System.err.println("Error " + ex);
        }
        
        return connection_;
    }
}
