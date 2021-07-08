package pkgstatic;
public class StaticDemo {
    public double principle;
    public int time;
    public static float interestRate; //static variable is also called class variable
    
    public double calculateInterest(){
       /* static int a; This is not possible because we cannot declare static 
       data member inside the instance member function. */
        return (principle*time*interestRate)/100;
    }
    public static double calculateInterest1(){
        return interestRate;
       /* return (principle*time*interestRate)/100;
        We cannot access instance data member into the static member function
        */
    } 
    
}
class StaticDemoTest{
    public static void main(String[] args) {
        StaticDemo.interestRate=10.2f;
        //StaticDemo.principle=1000; instance variable cannot be initialize by classname.
        StaticDemo sd=new StaticDemo();
        sd.principle=10000;
        sd.time=2;
        System.out.println(sd.calculateInterest());
        System.out.println(StaticDemo.calculateInterest1());
        
    }
}

