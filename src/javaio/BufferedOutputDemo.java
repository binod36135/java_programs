package javaio;
import java.io.*;
public class BufferedOutputDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout=null;
        BufferedOutputStream bout=null;
        try{
            fout=new FileOutputStream("F:/binod2.txt");
            bout=new BufferedOutputStream(fout);
            String data="I am from CCT college";
            byte b[]=data.getBytes();
            bout.write(b);
            bout.close();
        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            if(bout!=null){
                bout.flush();
               
            }
            if(fout!=null){
                fout.close();
            }
        }
    }
    
}
