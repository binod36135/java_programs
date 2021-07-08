// In addition to having the side-effect of setting the attributes in question,
// the setters return "this" (the current Person object) to allow for further chained method calls.

package javaapplication1;
public class MethodChain {
    private int firstNumber;
    private int secondNumber;
    
    public MethodChain setFirstNumber(int n){
        this.firstNumber=n;
        return this;
    }
    
    public MethodChain setSecondNumber(int m){
        this.secondNumber=m;
        return this;
    }
    
    
    public void calculate(){
        int sum=firstNumber+secondNumber;
        System.out.println(sum);
    }
    public static void main(String[] args){
        MethodChain mc=new MethodChain();
        mc.setFirstNumber(5).setSecondNumber(6).calculate();
    }
    
}
