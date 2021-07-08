package simple.program;
class Mango{
    Mango(){
        
    }
    Mango(String abc){
        System.out.println(abc+ "this is mango constructor");
    }
}

public class Test {
    Test(Mango obj){
        
    }
    
    public static void main(String[] args){
       Mango m1=new Mango("binod");
        
        
    }
    void calculate(){
        System.out.println("calculated called");
    }
    
}
