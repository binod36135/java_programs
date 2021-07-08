package Vehicle;
public class Test {
  public static void main(String[] args){
      Vehicle v0=new Vehicle();
      System.out.println(v0.getCompany());
      System.out.println(v0.getHeight());
      System.out.println(v0.getLength());
      System.out.println(v0.getColour());
      System.out.println(v0.getEngineCC());
      System.out.println(v0.getCost());
      System.out.println(v0.getCatogory());
      
      Vehicle v1=new Bus();
      System.out.println(v1.getCompany());
      System.out.println(v1.getHeight());
      System.out.println(v1.getLength());
      System.out.println(v1.getColour());
      System.out.println(v1.getEngineCC());
      System.out.println(v1.getCost());
      System.out.println(v1.getCatogory());
      
      Bus b1=new Bus();
      System.out.println(b1.getNoOfWheel());
      
      Vehicle v2=new Car();
      System.out.println(v2.getCompany());
      System.out.println(v2.getHeight());
      System.out.println(v2.getLength());
      System.out.println(v2.getColour());
      System.out.println(v2.getEngineCC());
      System.out.println(v2.getCost());
      System.out.println(v2.getCatogory());
      
      Car c1=new Car();
      System.out.println(c1.getNoOfSeat());
      
      
      Vehicle v3=new MotorCycle();
      System.out.println(v3.getCompany());
      System.out.println(v3.getHeight());
      System.out.println(v3.getLength());
      System.out.println(v3.getColour());
      System.out.println(v3.getEngineCC());
      System.out.println(v3.getCost());
      System.out.println(v3.getCatogory());
      
      MotorCycle m1=new MotorCycle();
      System.out.println(m1.getWeight());
  }  
}
