package simpleprograms0;
import javax.swing.JOptionPane;
public class program3 {
    public static void main(String[] args){
       String firstNumber;
       String secondNumber;
       int number1;
       int number2;
       int sum;
       firstNumber=JOptionPane.showInputDialog("Enter the first number");
       secondNumber=JOptionPane.showInputDialog("Enter the second number");
       number1=Integer.parseInt(firstNumber);
       number2=Integer.parseInt(secondNumber);
       sum=number1+number2;
       JOptionPane.showMessageDialog(null, sum);
    }
}
