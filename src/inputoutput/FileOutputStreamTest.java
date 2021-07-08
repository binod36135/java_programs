package inputoutput;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest{
public static void main(String[] args) throws IOException{
FileOutputStream fout;
fout=new FileOutputStream("F:\\my.txt()");
String data="Welcome CCT";
byte byteArray[]=data.getBytes();
fout.write(byteArray);
fout.close();
}
}




