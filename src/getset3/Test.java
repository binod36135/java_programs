package getset3;
public class Test {
    public static void main(String[] args){
        Initialization obj=new Initialization();
        obj.setFirstNumber(6);
        obj.setSecondNumber(9);
        System.out.println("The sum of two number is "+obj.getFirstNumber()+obj.getSecondNumber());
    }
    
}
