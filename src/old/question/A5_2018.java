package old.question;
import java.sql.*;
public class A5_2018 {
    public static void main(String[] args){
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/savita_database","root","root");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select *from customer_table");
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3) );
           }
         }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
 }


