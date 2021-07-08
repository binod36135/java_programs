package javaio;
import java.io.*;
public class IoDemo {
    public static void main(String[] args){
        try{
          FileOutputStream f1=new FileOutputStream("F:/binod.txt ");  
          f1.write(65);
          f1.close();
          System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
}
