package saurav_sukla;
public class StaticDemo1 {
    public static void main(String []args){
        First1 f=new First1();
        First1 s=new Second1();
        f.get();
        s.get();
        f.display();
        s.display();
        
    }
    
}
class First1{
    public static void get(){
        System.out.println("first:get");
    }
    public void display(){
        System.out.println("first:display");
    }
}
class Second1 extends First1{
    
    public static void get(){
        System.out.println("second:get");
    }
    
    public void display(){
        System.out.println("second:display");
    }
   
    
}
