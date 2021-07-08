package excersice1;
import java.util.Scanner;
public class FactorialDemo1 {
    public static void main(String [] args){
        int fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any integer number");
        int number=s.nextInt();
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("The factor is: "+fact);
    }
    
}


