package java.io;
import java.io.FileOutputStream;
public class FileOutputStreamTest {
    public static void main(String [] args){
        FileOutputStream fout;
        try{
            fout = new FileOutputStream("F:\my.txt");
            String data= "welcome CCT";
            byte byteArray[]=data.getBytes();
            fout.write(byteArray);q
        }catch(Exception ex){
            
        }finally{if(fout!=null){
            fout.close();
        }
        }
    }
}
    
    

