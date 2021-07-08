package simple.program;
interface Z{
 public int getData();
     
}
abstract class Y implements Z{
    public abstract String display();
       
    
   public int getData(){
        return 5;
    }
}
class X extends Y{
    public String display(){
        return ("display");
    }
    public int getData(){
        return 8;
    }

}
public class W {
    public static void main(String[] args) {
        
        X x1=new X();
        System.out.println(x1.display());
        System.out.println(x1.getData());
    }
    
}
