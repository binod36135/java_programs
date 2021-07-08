package old.question;
import java.io.*;
import java.net.*;
public class B4_2018 {
    public static void main(String[] args){
        ClientSide c=new ClientSide();
        ServerSide s=new ServerSide();
        c.setName("Client Running");
        s.setName("Server Running");
        c.start();
        s.start();
           
    }
}
class ClientSide extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hi Server");
            dos.flush();
            s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
class ServerSide extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName());
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println(str);
            s.close();
            ss.close();
           }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 }





