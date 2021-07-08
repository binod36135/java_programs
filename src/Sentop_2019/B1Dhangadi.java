/*
Write down code to handle the user defined exception. 

*/
package Sentop_2019;
public class B1Dhangadi {
    public static void main(String[] args){
        try{
            System.out.println("Starting try block");
            throw new MyException("This is my error message");
        }catch(MyException e){
            System.out.println(e);
        }
    }
    
}
class MyException extends Exception{
    String name;
    
   public  MyException(String name){
        this.name=name;
    }
    
    @Override
    public String toString(){
        System.out.println("catch block");
        return ("My Exception:"+ name);
      
       
    }
    
    
    
}
