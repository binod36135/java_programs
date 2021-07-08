package static1;
public class StaticDemo1 {
    static int a=20;
    
       
}
class Test1{
    public static void main(String[] args) {
        StaticDemo1 sd=new StaticDemo1();
        System.out.println(sd.a=5);  //why this ?? 
       
    }
}
