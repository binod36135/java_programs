package mobileconstructor;
public class TestConstructor {
    private final int firstNumber;
    private final  int secondNumber;
    //final variable cannot be change, it will be constant. 
    //here if we don't use final keyword, we will get output. 
    
  
   public TestConstructor(int x, int y){
       this.firstNumber=x;
       this.secondNumber=y;
   }
    public int getFirstNumber(){
        return firstNumber;
    }
    public int getSecondNumber(){
        return secondNumber;
    }
    /*public void changeValue(){
        firstNumber=400;
        System.out.println(firstNumber);
}
*/
}
class Test{
    public static void main(String[] args){
        TestConstructor obj=new TestConstructor(5,6);
        int x=obj.getFirstNumber();
        int y=obj.getSecondNumber();
        System.out.println("The sum of two number is "+x+y);
        //obj.changeValue();
    }
}
