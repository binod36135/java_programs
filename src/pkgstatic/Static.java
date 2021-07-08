//class level variable
package pkgstatic;
class Teacher{
    private static double salary=20000;
    
    public static double getSalary(){
        return salary;
    }
    public static double calculateTax(){
        return 0.1*salary;
    }
}
class Accountant extends Teacher{
public static double bankService(){
    return 0.1*Teacher.getSalary();//new Teacher().getSalary();
}
public static double calculateTax(){
    return 0.2*Teacher.getSalary();//new Teacher().getSalary();
}
}
public class Static {
    public static void main(String[] args) {
        //Teacher t1=new Accountant();
        System.out.println(Accountant.calculateTax());
        System.out.println(Accountant.bankService());
    }
 }
