package old.question;
import java.sql.*;
public class A3_2018new1 {
    public static void main(String args[]){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/binoddatabase","root","root");
            System.out.println("Connection Established");
            Statement stmt=con.createStatement();
            System.out.println("statement prepared");
            ResultSet rs=stmt.executeQuery("select *from binodtable");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            con.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
