package static1;
public class StaticDemo {
     static int a;
    
    public static int setA(int a){
        return a;
    }
    public int getA(){
        return this.a;
    }
    
}
class Test{
    public static void main(String[] args) {
        StaticDemo sd=new StaticDemo();
        //sd.a=10;
        //sd.setA(5);
        //System.out.println(sd.setA(5));
        StaticDemo.a=5;
        System.out.println(sd.getA());
    }
}
