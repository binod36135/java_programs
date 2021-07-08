package interface2;
public class Test {
    public static void main(String[] args){
        WhiteBoard w1=new Laptop();
        WhiteBoard w2=new Television();
        System.out.println(w1.getData());
        System.out.println(w2.getData());
    }
    
}
