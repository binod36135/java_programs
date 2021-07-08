package abstract1;
public abstract class AbstractDemo1 {
    protected int firstNumber;
    protected int secondNumber;
   
    public AbstractDemo1(int firstNumber, int secondNumber){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }
    public int getAddition(){
        return this.firstNumber+this.secondNumber;
    }
    public abstract int getMultiplication();
    public abstract int getDivision();
}
