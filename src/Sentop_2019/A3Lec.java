/*
 Write a simple program defining thread by implementing Runnable interface.
 */
package Sentop_2019;
class ThreadDemo implements Runnable{
    
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("The number is:"+ i);
        }
    }
    
}

public class A3Lec  {
    public static void main(String[] args){
        ThreadDemo t1=new ThreadDemo();
        Thread t=new Thread(t1);
        t.start();
    }
    
}
