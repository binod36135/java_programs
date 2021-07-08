package javaio;
import java.io.*;
public class SequenceInputDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream f1=null;
        FileInputStream f2=null;
        SequenceInputStream s1=null;
        try{
            f1=new FileInputStream("F:/binod1.txt");
            f2=new FileInputStream("F:/binod2.txt");
            s1=new SequenceInputStream(f1,f2);
            int i;
            do{
                i=s1.read();
                System.out.print((char)i);
            }while(i!=-1);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            if (f1!=null){
                f1.close();
            }
            if(f2!=null){
                f2.close();
            }
            if(s1!=null){
                s1.close();
            }
        }
                
    }
    
}
