package abstract1;
abstract class Manager{
    //how this constructor is called.
    public Manager(){
        System.out.println("constructor in abstract class");
    }
    public String getColor(){
        return ("red");
    }
   public abstract String getName();
}
abstract class Designer extends Manager{
    
    public int getHeight(){
     
        return(8);
    }
    
}
class Taster extends Designer{
    public String getName(){
        return "Binod";
    }
}
public class Start {
    public static void main(String[] args) {
        Taster t=new Taster();
        String color=t.getColor();
        int height=t.getHeight();
        String name=t.getName();
        System.out.println(color);
        System.out.println(height);
        System.out.println(name);
    }
    
}
