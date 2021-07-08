package area2;
import java.util.Scanner;
public class Area2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        float length=s.nextFloat();
        float breadth=s.nextFloat();
        float area=length*breadth;
        System.out.println("The area is "+area);
        
    }
    
}
