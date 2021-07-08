import java.sql.*;  
class MysqlConnect{  
public static void main(String args[]) throws Exception{  
 
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/cct","root","root");  
 if(con==null){
     System.out.println("not conn");
     
     
   System.out.println("not conn");          
             
 }
}}