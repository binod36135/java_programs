package simple.program;
class Manager{
    public String getColor(){
        return("black");
    }
}
class Designer extends Manager{
    public String getColor(){
        return("white");
    }
}
class Programmer extends Manager{
    public String getColor(){
        return("red");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Manager m1=new Manager();
        System.out.println(m1.getColor());
        Designer d1=new Designer();
        System.out.println(d1.getColor());
        Programmer p1=new Programmer();
        System.out.println(p1.getColor());
    }
    
}
