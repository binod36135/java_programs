package generics;
public class GenericClassTest<T> {
    T number;
    public void set(T no){
        number=no;
    }
    public T get(){
        return number;
    }
    public static void main(String[] args){
        GenericClassTest<Integer> gct=new GenericClassTest<Integer>();
        gct.set(10);
        System.out.println(gct.get());
        GenericClassTest<String> gct1=new GenericClassTest<String>();
        gct1.set("Binod");
        System.out.println(gct1.get());
        
    }
    
}
