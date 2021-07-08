package excersice1;
import java.util.*;
public class Factor {
   public int n=1;
   public int fact(int n){
       if (n==0) {
           return 0;
       }else if(n==1){
           return 1;
       }else{
           return n*fact(n-1);
       }
   }
    public static void main(String[] args){
        Factor f=new Factor();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int x=s.nextInt();
        System.out.println("The factor is"+f.fact(x));
        
    }
    
}
