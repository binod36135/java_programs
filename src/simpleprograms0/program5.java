package simpleprograms0;
import javax.swing.JOptionPane;
public class program5 {
    public static void main(String[] args){
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        int sum;
        firstNumber=JOptionPane.showInputDialog("Enter the first number");
        secondNumber=JOptionPane.showInputDialog("Enter second number");
        number1=Integer.parseInt(firstNumber);
        number2=Integer.parseInt(secondNumber);
        sum=number1+number2;
        JOptionPane.showMessageDialog(null,"The sum is"+" "+ sum);
    }
    
}
