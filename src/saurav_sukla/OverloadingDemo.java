package saurav_sukla;
public class OverloadingDemo {
    public static void main(String [] args){
        Second s=new Second();
        s.get(5);
        s.get(5,6);
    }
}
class First{
     
    int a; 
   public void get(int a){
       System.out.println("First :"+a); 
   }
    
}
class Second extends First{
    int b;
   
    public void get(int a, int b){
        System.out.println("Second: "+a+","+b);
    }
}
