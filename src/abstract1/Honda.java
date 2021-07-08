package abstract1;

public class Honda {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.display();
        c1.yamaha();
        c1.suzuki();
    }
   
}
abstract class Byke{
  // private int firstNumber;
//public Byke(int i){
    //this.firstNumber=i;
//}
public void display(){
    System.out.println("display");
}
public abstract void yamaha();
public abstract void suzuki();

}
class Car extends Byke{
    
    public void yamaha(){
        System.out.println("yamaha");
    }
    public void suzuki(){
        System.out.println("suzuki");
    }
}