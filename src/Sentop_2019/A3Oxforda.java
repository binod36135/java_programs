/*
 WA example of thread synchronization and show it output
 */
package Sentop_2019;
class Table{
public synchronized void printTable(int n){
    for(int i=1;i<=10;i++){
        System.out.println(n+ "x" +i+ "=" +n*i);
    }
}
}
class T1 extends Thread{
    Table t;
    T1(Table t){
        this.t=t;
    }

    @Override
    public void run(){
        t.printTable(5);
    }
}
class T2 extends Thread{
    Table t;
    T2(Table t){
        this.t=t;
    }
    @Override
    public void run(){
        
        t.printTable(10);
    }
}
public class A3Oxforda {
    public static void main(String[] args){
        Table obj=new Table();
        T1 t1=new T1(obj);
        T2 t2=new T2(obj);
        t1.start();
        t2.start();
    }
    
}
