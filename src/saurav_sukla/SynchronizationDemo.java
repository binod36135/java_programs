package saurav_sukla;
class Table{
    public  synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"   x  "+i+"  =   "+n*i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Thread1 extends Thread{
    Table t1;
    public Thread1(Table t1){
        this.t1=t1;
    }
    public void run(){
        t1.printTable(5);
    }
}
class Thread2 extends Thread{
    Table t2;
    public Thread2(Table t2){
        this.t2=t2;
    }
    public void run(){
        t2.printTable(10);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Table table=new Table();
        Thread1 t1=new Thread1(table);
        Thread2 t2=new Thread2(table);
        t1.start();
        t2.start();
    }
    
}
