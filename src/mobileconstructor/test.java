//no return type in constructor
package mobileconstructor;
public class test {
    public static void main(String[] args){
      //passing value to the object through setter methods
    Mobile m1=new Mobile();
    m1.setName("OPPO");
    m1.setStorage(32);
    m1.setRam(3);
    m1.setCost(32000);
    
    System.out.println(m1.getName());
    System.out.println(m1.getStorage());
    System.out.println(m1.getRam());
    System.out.println(m1.getCost());
    
    //passing value to the objects through parameterized constructor
   /* Mobile m2=new Mobile("OPPO",32,3,32000);
    System.out.println(m2.getName());
    System.out.println(m2.getStorage());
    System.out.println(m2.getRam());
    System.out.println(m2.getCost());*/
    
    }
       
}
