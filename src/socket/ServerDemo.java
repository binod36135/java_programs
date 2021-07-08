package socket;
import java.io.*;
import java.net.*;
public class ServerDemo extends Thread {
    public void run() {
           
        try{
        Thread.sleep(12000);
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF("hello");
        dos.flush();
        //dos.close();
        String str=(String)dis.readUTF();
        System.out.println(str);
        //s.close();
        //ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args){
        ServerDemo sd=new ServerDemo();
        sd.start();
        
    }
    
}
