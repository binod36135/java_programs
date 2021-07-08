package connect;
import java.sql.*;
import javax.swing.JOptionPane;
public class OracleConnection {
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="system";
    private static final String PASSWORD="*letmegoinside123#";
    private static Connection connection=null;
 
    public static Connection oracleConnect(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            connection=DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
         
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
