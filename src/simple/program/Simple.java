package simple.program;
class Temple12
{
   Temple12 (String test)
   {
       System.out.println("Hello constructor " + test);
   }
   
   void display ()
   {
       System.out.print("Hello" + " display");
   }
           
}
public class Simple {
       
    public static void main (String[] args)
    {
        Temple12 o=new Temple12("binod");
        Simple1 s=new Simple1();
        s.test(o);
                //A test;
        //A o = new A("ram");
        //test(o);
       // test.display();
       // test = "dfdfd";
    }
}
class Simple1{
    void test(Temple12 obj){
       obj.display();
    }
    
}
