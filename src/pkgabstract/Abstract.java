package pkgabstract;
public class Abstract{
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
    }
}

abstract class Animal{
    public Animal(){
        System.out.println("constructor in Abstract class");
    }
    public abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Woof");
    }
   
}