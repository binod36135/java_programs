package saurav_sukla;
public class StaticDemo {
    public static void main(String[] args){
       A a1=new A();
       // a1.setA(6);
      System.out.println(a1.getA());
       // A.setB(7);
       System.out.println(A.getB());
       System.out.println(A.Inner.COUNTRY);
       a1.setNumber(25);
        System.out.println(a1.getNumber());
        int a=Integer.parseInt("125");
        Integer i1=Integer.valueOf("1111",2);
        System.out.println(a);
        System.out.println(i1);
    }
    
}
class A{
   private int a;
   private static int b;
   private Integer number;
   
   public void setNumber(Integer number){
       this.number=number;
   }
   public Integer getNumber(){
       return this.number;
   }
   
   
   static class Inner{
       public static final String COUNTRY="Nepal";
   }
   
   public void setA(int a){
       this.a=a;
       
   }
   public int getA(){
       return this.a;
       
   }
   public static void setB(int num){
       
       b=num;
   }
   public static int getB(){
       return b;
   }
}
