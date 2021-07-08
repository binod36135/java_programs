package pkgstatic;
public class Employee {
private int empId;
private int empSalary;
private static String empCeo;

public void setEmpId(int empId){
    this.empId=empId;
}
public int getEmpId(){
    return this.empId;
}
public void setEmpSalary(int empSalary){
    this.empSalary=empSalary;
}
public int getEmpSalary(){
    return this.empSalary;
}
public static void setEmpCeo(String empCeo1){
    empCeo=empCeo1;
}
public static String getEmpCeo(){
    return empCeo;
}

}
class EmployeeTest{
    public static void main(String[] args) {
        Employee.setEmpCeo("Binod Bhandari");
        Employee e1=new Employee();
        e1.setEmpId(1);
        e1.setEmpSalary(40000);
        System.out.println(e1.getEmpId()+" ,"+ e1.getEmpSalary()+ ", "+ e1.getEmpCeo());
        
        Employee e2=new Employee();
        e2.setEmpId(2);
        e2.setEmpSalary(50000);
        System.out.println(e2.getEmpId()+" ,"+ e2.getEmpSalary()+ ", "+ e2.getEmpCeo());
        
        Employee e3=new Employee();
        e3.setEmpId(3);
        e3.setEmpSalary(30000);
        System.out.println(e3.getEmpId()+" ,"+ e3.getEmpSalary()+ ", "+ e3.getEmpCeo());
        
        Employee e4=new Employee();
        e4.setEmpId(4);
        e4.setEmpSalary(60000);
        //e4.setEmpCeo("Ram Thapa");
        System.out.println(e4.getEmpId()+" ,"+ e4.getEmpSalary()+ ", "+ e4.getEmpCeo());
        
       
        
        for(int i=5;i<=20;i++){
            Employee ei=new Employee();
            ei.setEmpId(i);
            ei.setEmpSalary(7000);
            System.out.println(ei.getEmpId()+" ,"+ ei.getEmpSalary()+ ", "+ ei.getEmpCeo());
            
            
        }
        
        
    }
}
