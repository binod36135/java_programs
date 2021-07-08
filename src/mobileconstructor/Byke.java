package mobileconstructor;
 class Honda {
     //final variable cannot be changed.
     private final int  number;
   
     public Honda(int number){
         this.number=number;
        
    }
     public int getData(){
         return this.number;
     }
    
}
public class Byke{
    public static void main(String[] args){
        Honda b1=new Honda(10);
        System.out.println(b1.getData());
        
    }
}
