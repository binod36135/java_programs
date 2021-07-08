package saurav_sukla;
public class PublicClassDemo {
   protected static int firstNumber;
    
   static
   {
    firstNumber=6;   
    System.out.println("Static Initialization blokc: "+firstNumber);
    
   }
      
   public int get(){
       return firstNumber;
   }
}
