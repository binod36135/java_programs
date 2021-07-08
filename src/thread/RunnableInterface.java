package thread;
public class RunnableInterface implements Runnable {
    @Override
    public void run(){
        System.out.println("Thread Running");
    }
   public static void main(String[] args) {
        RunnableInterface r2=new RunnableInterface();
        Thread r1=new Thread(r2);
        r1.start();
    }
}
