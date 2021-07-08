package saurav_sukla;
public class FinalVariableDemo {
    public static void main(String [] args){
        One o=new One();
        System.out.println(o.a);
    }
    
}
class One{
    final int a;
    
    
    /*{
        a=5;
    }*/
    
    One(){
        a=6;
    }
    
    
}
