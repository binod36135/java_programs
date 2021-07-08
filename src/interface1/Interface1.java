package interface1;
public class Interface1{
    public static void main(String[] args) {
        Car1 c1=new Car1();
        c1.setFuel(30);
        System.out.println(c1.getFuel()+" liter");
        c1.run();
    }
}
interface MotorVehicle{
    //by default methods are public and abstract.
    void run();
    int getFuel();
}
class Car1 implements MotorVehicle{
    private int fuel;
    
    public void run(){
        System.out.println("Running");
    }
    public void setFuel(int fuel){
        this.fuel=fuel;
    }
    public int getFuel(){
        return this.fuel;
    }
}
  