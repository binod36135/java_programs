package old.question;
public class B2_2018 {
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.setName("first");
        t2.setName("second");
        t3.setName("third");
        t1.start();
        t2.start();
        t3.start();
     }
}
class Thread1 extends Thread{
     @Override
     public void run(){
        for(int i=0;i<=5;i++){
            System.out.println
            (i+"      "+Thread.currentThread().getId()+
             "     "+Thread.currentThread().getName());
            try{
                Thread.sleep(1500); 
            }catch(Exception e){
                System.out.println(e);
            }
           
        }
        
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println
            (i+"      "+Thread.currentThread().getId()+
             "    "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread3 extends Thread{
    @Override
    public void run(){
        for(int i=11;i<=15;i++){
            System.out.println
            (i+"      "+Thread.currentThread().getId()+
             "    "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}





