package exception0;
public class Test1 {
    public static void main(String[] args){
        int a,b;
        try{
         a=0;
         b=10/a;
         System.out.println("Do you think this will print out");
        }
         catch (ArithmeticException e){
                 System.out.println("Division by zero is not possible");
                 }
        System.out.println("This will print after exception");
        }
        
        
    }
    

