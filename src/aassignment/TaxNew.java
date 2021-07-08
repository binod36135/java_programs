package aassignment;
import java.util.Scanner;
public class TaxNew {
    public static void main(String[] args){
        double tax;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.next();
        System.out.println("Enter your sex");
        String sex=s.next();
        System.out.println("Enter your age");
        int age=s.nextInt();
        System.out.println("Do you have insurance");
        String insurance=s.next();
        System.out.println("Enter your income");
        double income=s.nextDouble();
        System.out.println("Enter maritalstatus");
        String maritalstatus=s.next();
        
        if("single".equals(maritalstatus)){
            if("male".equals(sex)){
               // if("N".equals(insurance)||"n".equals(insurance)&&income<=350000){
                    //we can use equal ignore cae. parenthesis mistake.
                    if(("n".equalsIgnoreCase(insurance))&&income<=350000){
                    tax=0.1*income;
                    System.out.println("Tax="+tax);
                }
                else
                    if("N".equalsIgnoreCase(insurance)&&income>350000&&income<=450000){
                    tax=(0.1*350000)+(0.15*(income-350000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("N".equalsIgnoreCase(insurance)&&income>450000){
                    tax=(0.1*350000)+(0.15*10000)+(0.25*(income-450000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income<=375000){
                        //logical comment
                    tax=0.1*(income-25000);
                    System.out.println("Tax="+tax);
                }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income>375000&&income<=475000){
                    double a=income-25000;
                    tax=(0.1*350000)+(0.15*(a-350000));
                    System.out.println("Tax="+tax);
                    }
                
                else
                    if("Y".equalsIgnoreCase(insurance)&&income>475000){
                    double a=income-25000;
                    tax=(0.1*350000)+(0.15*100000)+(0.25*(a-450000));
                    }
                }
            else
                if("female".equals(sex)){
                    if("N".equalsIgnoreCase(insurance)&&income<=360000){
                    tax=0.1*income;
                    System.out.println("Tax="+tax);
                }
                else
                    if("N".equalsIgnoreCase(insurance)&&income>360000&&income<=460000){
                    tax=(0.1*360000)+(0.15*(income-360000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("N".equalsIgnoreCase(insurance)&&income>460000){
                    tax=(0.1*350000)+(0.15*10000)+(0.25*(income-460000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income<=385000){
                    tax=(0.1*(income-25000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income>375000&&income<=475000){
                    double a=income-25000;
                    tax=(0.1*350000)+(0.15*(a-350000));
                    System.out.println("Tax="+tax);
                    }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income>475000){
                    double a=income-25000;
                    tax=(0.1*350000)+(0.15*100000)+(0.25*(a-450000));
                    System.out.println("Tax="+tax);
                    }
                }
        }
        else
            if("double".equals(maritalstatus)){
               if("N".equalsIgnoreCase(insurance)&&income<=400000){
                    tax=0.1*income;
                    System.out.println("Tax="+tax);
                }
                else
                    if("N".equalsIgnoreCase(insurance)&&income>400000&&income<=500000){
                    tax=(0.1*400000)+(0.15*(income-400000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("N".equalsIgnoreCase(insurance)&&income>500000){
                    tax=(0.1*400000)+(0.15*10000)+(0.25*(income-500000));
                    System.out.println("Tax="+tax);
                }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income<=425000){
                    double a=income-25000;
                    tax=(0.1*a);
                    System.out.println("Tax="+tax);
                }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income>425000&&income<=525000){
                    double a=income-25000;
                    tax=(0.1*400000)+(0.15*(a-400000));
                    System.out.println("Tax="+tax);
                    }
                else
                    if("Y".equalsIgnoreCase(insurance)&&income>525000){
                    double a=income-25000;
                    tax=(0.1*400000)+(0.15*100000)+(0.25*(a-500000));
                    System.out.println("Tax="+tax);
                    } 
            }
        
        
        
    }
    
}
