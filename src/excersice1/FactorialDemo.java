package excersice1;
import java.util.Scanner;
public class FactorialDemo {
    public int getFact(int number){
        if(number==0){
            return 0;
        }else if(number==1){
            return 1;
        }else{
            return number*getFact(number-1);
        }
    }
    public static void main(String []args){
        FactorialDemo fd=new FactorialDemo();
        Scanner s=new Scanner(System.in);
        System.out.println("Input any integer number");
        int num=s.nextInt();
        System.out.println("The factor is: "+ fd.getFact(num));
    }
}
