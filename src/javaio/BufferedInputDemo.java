package javaio;
import java.io.*;
public class BufferedInputDemo {
    public static void main(String[] args) throws IOException{
       FileInputStream fin=null;
       BufferedInputStream bin=null;
           int i;
           fin=new FileInputStream("F:/binod2.txt");
           bin=new BufferedInputStream(fin);
            do{
               i=bin.read();
               System.out.print((char)i);
           }while(i!=-1);
      
           if(bin!=null){
               bin.close();
           }
           if(fin!=null){
               fin.close();
           }
       }
       
    }
    

