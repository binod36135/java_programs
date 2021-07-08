package connect;
import java.sql.*;  
class OracleConnect{  
public static void main(String args[]){ 
      
    Connection con= OracleConnection.oracleConnect(); 

try{
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from emp");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();
 
}catch(Exception e){
    System.out.println(e);
}

}
}
  
 
 

 
