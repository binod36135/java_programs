package socket;
import java.io.*;
import java.net.*;
public class ClientDemo {
    public static void main(String[] abc){
        try{
        Socket s=new Socket("localhost",6666);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        dos.writeUTF("hi server");
        dos.flush();
        //dos.close();
        String str=(String)dis.readUTF();
            System.out.println(str);
           // dis.close();
        //s.close(); 
       
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
