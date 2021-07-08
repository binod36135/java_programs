package excersice1;
public class ThreadTest1 implements Runnable{
    public void run(){
        System.out.println("Running thread");
    }
    public static void main(String[] args){
        ThreadTest1 td1=new ThreadTest1();
        Thread t1=new Thread(td1);
        t1.start();
    }
    
}
