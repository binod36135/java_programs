package interface1;
interface A{
    public int display();
}
interface B{
    public int speedLimit();
}
class C implements A,B{
    public int display(){
        return 5;
    }
    public int speedLimit(){
        return 40;
    }
}
public class Test {
    public static void main(String[] args) {
        C c1=new C();
        System.out.println(c1.display());
        System.out.println(c1.speedLimit());
        
    }
    
}
