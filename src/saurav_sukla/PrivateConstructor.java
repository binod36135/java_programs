package saurav_sukla;
public class PrivateConstructor {
    String name;
    
    private PrivateConstructor(String name){
        this.name=name;
    }
    public String get(){
        return this.name;
    }
    public static void main(String[] args){
        PrivateConstructor cd=new PrivateConstructor("savita");
        System.out.println(cd.get());
       
    }
}


