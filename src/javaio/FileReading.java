package javaio;
import java.io.*;
public class FileReading {
    public static void main(String[] args){
          try{
            int i=0;
            FileInputStream fin=new FileInputStream("f:/binod1.txt");
            
            do{
              i=fin.read();         
              System.out.print((char)i);  
                                    
            }while(i!=-1);
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        }
        
    }
    

