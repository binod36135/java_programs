package old.question;
//we can create multiple inheritance in java through interface. 
interface A{
    public void show();
}  
interface B{
    public void write();
 }
class C implements A,B{
    @Override
    public void show(){
        System.out.println("This is show method");
    }
    @Override
    public void write(){
        System.out.println("This is writie method");
    }
}
public class A1_2018 {
    public static void main(String[] args){
       C c1=new C();   c1.show();  c1.write();
    }
 }                                                                             
