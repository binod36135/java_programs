package generics;
public class GenericClassTest1<T> {
    private T data;
    
    public void set(T data){
        this.data=data;
    }
    
    public T get(){
        return this.data;
    }
    public static void main(String [] args){
        GenericClassTest1<Integer> gct1=new GenericClassTest1();
        gct1.set(5);
        System.out.println(gct1.get());
    }
    
    
    
}
