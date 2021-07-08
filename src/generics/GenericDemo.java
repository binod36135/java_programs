package generics;
public class GenericDemo {
    public static void main(String[] args){
        GenericClassTest1 <String> abc=new GenericClassTest1();
        abc.set("Binod");
        System.out.println(abc.get());
    }
    
}
