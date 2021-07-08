package abstract1;
public class ConcreteDemo extends AbstractDemo1 {
  
    public ConcreteDemo(int firstNumber, int secondNumber){
        super(firstNumber,secondNumber);
    }
    
    
    public int getMultiplication(){
        return firstNumber*secondNumber;
    }
    public int getDivision(){
        return firstNumber/secondNumber;
    }
}
