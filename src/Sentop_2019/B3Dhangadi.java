/*
Create two threads, the first thread display first 10 characters from a file number in every
1 second and the second theread will display all character from file called exam.txt in 0.5 
seconds.
*/
package Sentop_2019;
import java.io.*;

public class B3Dhangadi {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        
    }
}
class Thread1 extends Thread{
    public void run(){
         FileInputStream fin=null;
         try{
             fin=new FileInputStream("F:/exam.txt");
             int i=0;
             while((i=fin.read())!=10){
                 System.out.println((char)i);
              Thread.sleep(1000);
             }
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
        
    }
   
}
    


class Thread2 extends Thread{
     public void run(){
          FileInputStream fin=null;
         try{
             fin=new FileInputStream("F:/exam.txt");
             int i=0;
             while((i=fin.read())!=-1){
                 System.out.println((char)i);
              Thread.sleep(500);
             }
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
        
    }
   
}

