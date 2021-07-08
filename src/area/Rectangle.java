package area;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int firstNumber=reader.nextInt();
        int secondNumber=reader.nextInt();
        int areaOfRectangle=firstNumber*secondNumber;
        System.out.println("The area of Rectangle is "+ areaOfRectangle);
    }
    
}
