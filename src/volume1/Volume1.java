package volume1;
import java.util.Scanner;
public class Volume1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length, breadth and height of cuboid");
        float length=s.nextFloat();
        float breadth=s.nextFloat();
        float height=s.nextFloat();
        float volume=length*breadth*height;
        System.out.println("The volume of cuboid is "+volume);
       
    }
    
}
