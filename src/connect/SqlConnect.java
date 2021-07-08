package connect;
import java.sql.*;  
class SqlConnect{  
public static void main(String args[]){  
    InsertDemo.run();
    
try{  
Class.forName("com.mysql.jdbc.Driver"); 
System.out.println("driver loaded");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/binoddatabase","root","");  

System.out.println("connection success");
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from login");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}
}
class InsertDemo{
   
    public static void  run(){
        String url="jdbc:mysql://localhost:3306/sims";
        String username="root";
        String password="";
        String query="insert into test(name, address)"+ "values('Ram','aaa')";
        
        try{  
 Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("Class loaded, insert");

Connection con=DriverManager.getConnection(  
url,username,password); 
Statement stmt = con.createStatement();

stmt.executeUpdate(query);  
con.close();  
}catch(Exception e){ 
            System.out.println(e);
}
    }
    
}
