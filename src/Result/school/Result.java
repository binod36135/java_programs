package result.school;
import java.util.*;
public class Result {
    private double markOfScience;
    private double markOfMath;
    private double markOfComputer;
    private double markOfEnglish;
    private double markOfNepali;
    private double markOfEph;
    private double markOfSocial;
    private double markOfAccount;
    
    public void setMarkOfScience(double s){
         this.markOfScience=s;
    }
    public double getMarkOfScience(){
        return markOfScience;
    }
    public void setMarkOfMath(double m){
        this.markOfMath=m;
    }
    public double getMarkOfMath(){
        return markOfMath;
    }
    public void setMarkOfComputer(double c){
        this.markOfComputer=c;
    }
    public double getMarkOfComputer(){
        return markOfComputer;
    }
    public void setMarkOfEnglish(double e){
        this.markOfEnglish=e;
    }
    public double getMarkOfEnglish(){
        return markOfEnglish;
    }
    public void setMarkOfNepali(double n){
        this.markOfNepali=n;
    }
    public double getMarkOfNepali(){
        return markOfNepali;
    }
    public void setMarkOfEph(double e){
        this.markOfEph=e;
    }
    public double getMarkOfEph(){
        return markOfEph;
    }
     public void setMarkOfSocial(double s){
        this.markOfEph=s;
    }
    public double getMarkOfSocial(){
        return markOfSocial;
    }
     public void setMarkOfAccount(double a){
        this.markOfAccount=a;
    }
    public double getMarkOfAccount(){
        return markOfAccount;
    }
 
 }
class Test{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Result r=new Result();
        System.out.println("Enter the marks of all subjects");
        System.out.println("--------------------------------");
        System.out.println("Enter the marks of Science");
        Double science=s.nextDouble();
        System.out.println("Enter the marks of Math");
        Double math=s.nextDouble();
        System.out.println("Enter the marks of Computer");
        Double computer=s.nextDouble();
        System.out.println("Enter the marks of English");
        Double english=s.nextDouble();
        System.out.println("Enter the marks of Nepali");
        Double nepali=s.nextDouble();
        System.out.println("Enter the marks of EPH");
        Double eph=s.nextDouble();
        System.out.println("Enter the marks of Social");
        Double social=s.nextDouble();
        System.out.println("Enter the marks of Account");
        Double account=s.nextDouble();
        
        r.setMarkOfScience(science);
        r.setMarkOfMath(math);
        r.setMarkOfComputer(computer);
        r.setMarkOfEnglish(english);
        r.setMarkOfNepali(nepali);
        r.setMarkOfEph(eph);
        r.setMarkOfSocial(social);
        r.setMarkOfAccount(account);
        
        if(r.getMarkOfScience()>=32 && r.getMarkOfMath()>=32 && r.getMarkOfComputer()>=32 && r.getMarkOfEnglish()>=32 && r.getMarkOfNepali()>=32 && r.getMarkOfEph()>=32 && r.getMarkOfSocial()>=32 && r.getMarkOfAccount()>=32){
        Double total=r.getMarkOfScience()+r.getMarkOfMath()+r.getMarkOfComputer()+r.getMarkOfEnglish()+r.getMarkOfNepali()+r.getMarkOfEph()+r.getMarkOfSocial()+r.getMarkOfAccount();
        Double percentage=total/8;
        
        System.out.println("Total= "+total);
        System.out.println("Percentage= "+percentage);
        if (percentage>=80) {
        System.out.println("Congratulation, Distintion");
    }else if(percentage>=60){
            System.out.println("Congratulation, First Division");
    }else if (percentage>45){
            System.out.println("Congratulation, Second Division");
    }else{
            System.out.println("Congratulation, Third Division");
    }
        
            
    }else {
            System.out.println("Sorry, Fail");
        }
    }
}
