package simpleprograms0;

class A1 implements Runnable{
    @Override
    public void run(){
        System.out.println("thread Running");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        A1 a=new A1();
        Thread t=new Thread(a);
        t.start();
    }
    
}
