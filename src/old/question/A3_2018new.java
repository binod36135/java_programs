package old.question;
import java.util.*;
import java.io.*;
public class A3_2018new {
    private static String name;
    private static String address;
    //private static int phone;
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name of 10 employee");
        for(int i=0;i<=10;i++){
            String name=s.next();
        }
        System.out.println("Enter Address of 10 employee");
        for(int i=0;i<=10;i++){
            String address=s.next();
        }
        /*System.out.println("Enter phone number");
        for(int i=0;i<=10;i++){
            int phone=s.nextInt();
        }*/
        
        FileOutputStream fout=null;
        BufferedOutputStream bos=null;
        try{
            fout=new FileOutputStream("F:/savita.txt");
            bos=new BufferedOutputStream(fout);
            byte n[]=name.getBytes();
            byte a[]=address.getBytes();
            //byte p[]=phone.getInt();
            bos.write(n);
            bos.write(a);
            bos.close();
         }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}

