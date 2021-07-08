package abstract1;
public class Test {
    public static void main(String[] agrs){
        ConcreteClass c1=new ConcreteClass();
        System.out.println(c1.getName());
        System.out.println(c1.getHeight()+" inch");
        
        ConcreteDemo cd=new ConcreteDemo(4,2);
        System.out.println(cd.getAddition());
        System.out.println(cd.getMultiplication());
        System.out.println(cd.getDivision());
    }
    
}
