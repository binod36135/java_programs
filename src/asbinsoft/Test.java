package asbinsoft;
public class Test {
    public static void main(String[] agrs){
    
    Employee e1=new Employee();//parent ko object or RHS ma je hunxa tesaaiko object banxa.
    System.out.println(e1.getName());
    System.out.println(e1.getAddress());
    System.out.println(e1.getAge());
    System.out.println(e1.getCast());
    System.out.println(e1.getWork());
        
    Employee e2=new Manager();//downcasting, Sabby manager employee hunxan but sabby employee manager hudainan
    System.out.println(e2.getName());
    System.out.println(e2.getAddress());
    System.out.println(e2.getAge());
    System.out.println(e2.getCast());
    System.out.println(e2.getWork());
    
    Manager m1=new Manager();//work is same but method is different.
    System.out.println(m1.getWork());
    
    Employee e3=new Programmer();
    System.out.println(e3.getName());
    System.out.println(e3.getAddress());
    System.out.println(e3.getAge());
    System.out.println(e3.getCast());
    
    Programmer p1=new Programmer();
    System.out.println(p1.getWork());
    
    Employee e4=new SystemAnalyst();
    System.out.println(e4.getName());
    System.out.println(e4.getAddress());
    System.out.println(e4.getAge());
    System.out.println(e4.getCast());
    
    SystemAnalyst s1=new SystemAnalyst();
    System.out.println(s1.getWork());
    
    Employee l1 = new LazyBoy();
    System.out.println(l1.getWork());
    
    }
   
    
}
