//How can we implement hybrid inheritance in java through interface. 
package interface1;
interface D{
    //By default methods are public and abstract
    void display();
}
interface E extends D{
    void speedLimit();
}
interface F extends D{

}
class G implements E,F{
    public void display(){
        System.out.println("Binod Bhandari");
    }
    public void speedLimit(){
        System.out.println(5);
    }
}
public class Final {
    public static void main(String[] args) {
        G obj=new G();
        obj.display();
        obj.speedLimit();
    }
}
