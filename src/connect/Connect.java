package connect;
import java.sql.*;
public class Connect {
       public static void main(String[] args) {
       String url="jdbc:odbd:test";
       String query="Select * from test";
         try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("driver found");
            Connection con=DriverManager.getConnection(url);
            System.out.println("connection success");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2));
            }
            con.close();
  
        }catch(Exception e){
            System.out.println(e);
        }
    }
}