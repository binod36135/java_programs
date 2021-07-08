package old.question;
import java.util.*;
import java.io.*;
public class A3_2018 {
    private String name;
    private String address;
    private long phoneNumber;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
   
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name :");
        String name=s.nextLine();
        System.out.println("Enter Address : ");
        String address=s.nextLine();
       // System.out.println("Enter Phone number : ");
       // long phoneNumber=s.nextLong();
        
        A3_2018 a=new A3_2018();
        a.setName(name);
        a.setAddress(address);
        //a.setPhoneNumber(phoneNumber);
        
        FileOutputStream f=null;
        BufferedOutputStream bos=null;
        try{
           f=new FileOutputStream("F:/supplier.txt");
           bos=new BufferedOutputStream(f);
           String name1=a.getName();
           String address1=a.getAddress();
           //Long phoneNumber1=a.getPhoneNumber();
           
           byte n[]=name1.getBytes();
           byte ad[]=address1.getBytes();
           //long p[]=phoneNumber1.longValue();
           
           bos.write(n);
           bos.write(ad);
           //bos.write(p);
            bos.close();
           
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
