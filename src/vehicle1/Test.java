package vehicle1;
public class Test {
   public static void main(String[] agrs){
       Vehicle1 v1=new Vehicle1();
       System.out.println(v1.getSpeedLimit());
       Vehicle1 v2=new Car();  //why Vehicle1, why not Car but we get same output.
       System.out.println(v2.getSpeedLimit());
       Vehicle1 v3=new Bus();  //why Vehicle1, why not Bus but we get same output. 
       System.out.println(v3.getSpeedLimit());
   } 
}
