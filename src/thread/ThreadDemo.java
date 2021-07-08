package thread;
public class ThreadDemo extends Thread{
    synchronized public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName() + "Thread running" +i);
            try{
               //Thread.sleep(1000);  
            }catch(Exception e){
                System.out.println(e);
            }
           
        }
        
    }
    public static void main(String args[]){
        ThreadDemo td=new ThreadDemo();
        ThreadDemo td1=new ThreadDemo();
        ThreadDemo td2=new ThreadDemo();
        ThreadDemo td3=new ThreadDemo();
        ThreadDemo td4=new ThreadDemo();
        ThreadDemo td5=new ThreadDemo();
                
              td.setName("a1");
              td1.setName("a2");
              td2.setName("a3");
              td3.setName("a4");
              td4.setName("a5");
             td.start();
             td1.start();
             td2.start();
             td3.start();
             td4.start();
             td5.start();
             
        
       
        
    }
    
}
