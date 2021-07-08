package javaio;
import java.io.*;
public class IoDemo {
    public static void main(String[] args){
        try{
            FileOutputStream fout=new FileOutputStream("f:/binod1.txt");
            String s="Binod";
            char ch[]=s.toCharArray();
            for(int i=0;i<=s.length();i++){
                fout.write(ch[i]);
            }
            
            fout.close();
            System.out.println("Success");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
