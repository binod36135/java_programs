package overloading;
class A{
    public int sum(){
        int sum=5+8;
        return sum;
    }
    public int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int sum(int a, int b, int c){
        int sum=a+b+c;
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        A a1=new A();
        int a=a1.sum();
        int b=a1.sum(2,3);
        int c=a1.sum(2,3,4);
        System.out.println("no argument method called "+a);
        System.out.println("two argument method called "+b);
        System.out.println("three argument method called "+c);
    }
    
}
