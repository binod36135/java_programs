package aassignment;
import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        //String name=new String();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name?");
        String name=s.next();
        System.out.println("Enter your age");
        int age=s.nextInt();
        System.out.println("Enter your marital Status");
        String maritalstatus=s.next();
        System.out.println("Enter Income per yeaar");
        double salary=s.nextDouble();
        
        if(maritalstatus=="single"&&salary<=350000){
            double tax=0.01*salary;
            System.out.println("Tax="+tax);
        }
        else
            if(maritalstatus=="single"&&salary<=450000){
               double tax=0.15*salary;
               System.out.println("Tax="+tax);
            }
        else
                if(maritalstatus=="single"&&salary>450000){
                    double tax=0.25*salary;
                    System.out.println("Tax="+tax);
                }
        else
                    if(maritalstatus=="double"&&salary<=400000){
                        double tax=0.01*salary;
                        System.out.println("Tax="+tax);
                    }
        else
                        if(maritalstatus=="double"&&salary<=500000){
                            double tax=0.15*salary;
                            System.out.println("Tax="+tax);
                        }
        else
                            if(maritalstatus=="double"&&salary>500000){
                                double tax=0.25*salary;
                                System.out.println("Tax="+tax);
                            }
        
        
        
    }
    
}
