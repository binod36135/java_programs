package access4;
import access2.Access1;
public class Access5 extends Access1{
   public static  void main(String[] args){
       Access1 a1 = new Access1();
       Access5 a5=new Access5();
       a1.j=20;
       a1.m1();
       
       a5.j=30;
       a5.m1();
   }
    
}
