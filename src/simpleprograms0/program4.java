package simpleprograms0;
import javax.swing.JOptionPane;
public class program4 {
    public static void main(String[] args){
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        int sum;
        firstNumber=JOptionPane.showInputDialog("Enter First Number");
        secondNumber=JOptionPane.showInputDialog("Enter Second Number");
        number1=Integer.parseInt(firstNumber);
        number2=Integer.parseInt(secondNumber);
        sum=number1+number2;
        JOptionPane.showMessageDialog(null,"The Sum is"+" "+sum);
        
    }
    
}
