package simple.program;
interface Vehicle{
    public int car();
    public int bus();
      
}
abstract class Machine implements Vehicle{
    private final int speedlimit=80;
    public int car(){
        return speedlimit;
    }
    public int bus(){
        return speedlimit;
    }
}
class Transportation extends Machine{
    
}
public class Main {
    public static void main(String[] args) {
        Transportation t1=new Transportation();
        System.out.println(t1.car());
        System.out.println(t1.bus());
    }
    
}
