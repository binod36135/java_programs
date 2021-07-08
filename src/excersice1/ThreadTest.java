package excersice1;
public class ThreadTest extends Thread {
    public void run(){
        System.out.println("Running Thread");
    }
    public static void main(String[] agrs){
        ThreadTest tt=new ThreadTest();
        tt.start();
    }
    
}
