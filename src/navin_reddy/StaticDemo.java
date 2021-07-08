package navin_reddy;
class Employee{
    private final int salary;
    private final String name;
    private static String ceo;
    
    static{
        ceo="Gautam";
    }
    public Employee(){
        salary=20000;
        name="Joker";
    }
    
    
    public Employee(int salary, String name){
        this.salary=salary;
        this.name=name;
        
    }
    
    public void show(){
        System.out.println(name+":      "+salary+":          "+ceo);
    }
    
    
}
public class StaticDemo {
    public static void main(String[] args){
        Employee binod=new Employee(40000, "Binod");
        binod.show();
        
        Employee bijay=new Employee(30000, "Bijay");
        bijay.show();
        
        Employee anu=new Employee();
        anu.show();
    }
}
