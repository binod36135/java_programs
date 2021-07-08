package saurav_sukla;
class Super{
    public void show(){
        System.out.println("this is super class");
    }
}
class Sub extends Super{
    
     
     public void show(){
        System.out.println("this is sub class");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Sub s=new Sub();
        s.show();
    }
    
}
