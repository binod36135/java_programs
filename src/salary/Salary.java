//salary more than 10000,10% bonus, else 5% bonus.
package salary;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float totalSalary;
        System.out.println("Enter the salary");
        float salary=s.nextFloat();
        if(salary>=10000){
            totalSalary=(10*10000)/100+salary;//local variable
        }
        else{
            totalSalary=(5*10000)/100+salary;
        }
        System.out.println("The Total Salary= "+totalSalary);
           
        
        
    }
    
}
