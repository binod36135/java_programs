package getset4;
import java.util.Scanner;
public class Initialization {
    private int firstNumber;
    private int secondNumber;
    
    public void setFirstNumber(int x){
        this.firstNumber=x;
    }
    public int getFirstNumber(){
        return firstNumber;
    }
    public void setSecondNumber(int y){
        this.secondNumber=y;
    }
    public int getSecondNumber(){
        return secondNumber;
    }
}
 class Test{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        Initialization obj=new Initialization();
        System.out.println("Enter any two numbers");
        int x=reader.nextInt();
        int y=reader.nextInt();
        obj.setFirstNumber(x);
        obj.setSecondNumber(y);
        int sum=obj.getFirstNumber()+obj.getSecondNumber();
        System.out.println("The sum of two number is "+ sum);
    }
}
