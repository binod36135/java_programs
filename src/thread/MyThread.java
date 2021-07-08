package thread;
public class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<5;i++){
           System.out.println(i); 
        }
        
        
    }
}
    class B extends Thread{
        @Override
        public void run(){
            for(int i=5;i<11;i++){
                System.out.println(i);
            }
            
        }
    }
class C extends Thread{
    public void run(){
        for(int i=12;i<16;i++){
            System.out.println(i);
        }
    }
}
    class Test{
    public static void main(String[] args){
        MyThread obj=new MyThread();
        B b1=new B();
        C c1=new C();
        obj.start();
        b1.start();
        c1.start();
        obj.yield();
    }
}

    
