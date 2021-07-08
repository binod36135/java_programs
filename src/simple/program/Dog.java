package simple.program;
class One{
    public void eat(){
        System.out.println("They can eat rice");
    }
}
class Two extends One{
    public void doNotEat(){
        System.out.println("They cannot eat meat");
    }
}
public class Dog {
    public static void main(String[] args) {
        Two t1=new Two();
        t1.eat(); 
        t1.doNotEat();
    }
    
}
