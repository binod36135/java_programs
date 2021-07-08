package saurav_sukla;
class Employee{
    public void show(Accountent t, Accountent a){
        t.print1();
        a.print2();
    }
}
class Accountent extends Employee{
    public void print1(){
        System.out.println("This is print1");
    }
    public void print2(){
        System.out.println("This is print2");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Employee e=new Accountent();
        Accountent a1=new Accountent();
        Accountent a2=new Accountent();
        e.show(a1, a2);
        
        
    }
    
}
