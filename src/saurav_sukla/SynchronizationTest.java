package saurav_sukla;
import java.util.*;
public class SynchronizationTest {
    public static void main(String[] args){
        Account a=new Account(1000);
        Customer c1=new Customer(a, "Binod");
        Customer c2=new Customer(a, "Bijay");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
 
}
class Account{
    int balance;
    public Account(int balance){
        this.balance=balance;
    }
    
    public boolean isSufficient(int w){
        if(balance>w){
            return true;
        }else{
            return false;
        }
    }
    public void withDraw(int amount){
        balance=balance-amount;
        System.out.println("Withdraw money is: "+amount);
        System.out.println("Your current balance is: "+balance);
    }
}
class Customer implements Runnable{
    Account a;
    String name;
    public Customer(Account a, String name){
        this.a=a;
        this.name=name;
    }
    public void run(){
        Scanner s=new Scanner(System.in);
        synchronized(a){
        System.out.println(name+", Enter the amount :");
        int amount=s.nextInt();
        
        if(a.isSufficient(amount)==true){
             System.out.println(name);
            a.withDraw(amount);
        }else{
            System.out.println("Insufficient balance");
        }
        
    }
    }
}
