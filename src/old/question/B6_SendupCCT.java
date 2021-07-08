package old.question;
//Write a program to read the website of the www.cct.edu.np and save the contents 
//into the file cct.dat
import java.io.*;
import java.net.*;
public class B6_SendupCCT {
    public static void main(String[] args){
        try{
            URL a= new URL ("http://www.cct.edu.np");
            URLConnection con = a.openConnection ();
            InputStream in = con.getInputStream ();
            FileOutputStream out = new FileOutputStream ("f:/cct.dat");
            
            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }catch(Exception e){
            System.out.println(e);
        }
   }}


