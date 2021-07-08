package pkgstatic;
public class StaticDemo1 {
     int empId;
     int salary;
     static String ceo;
    
    public void showData(){
        System.out.println(empId +": "+ "Salary: "+salary+" ECO: "+ceo);
    }
    //inner class
     static class Demo{
        public static String country="NEPAL";
    }
}
class StaticDemo1Test{
    public static void main(String[] args){
       System.out.println(StaticDemo1.Demo.country);
       StaticDemo1.ceo="Binod";
        StaticDemo1 e1= new StaticDemo1();
        
        e1.empId=1;
        e1.salary=20000;
        e1.showData();
        
        StaticDemo1 e2=new StaticDemo1();
        e2.empId=2;
        e2.salary=40000;
        e2.showData();
        
        StaticDemo1 e3=new StaticDemo1();
        e3.empId=3;
        e3.salary=60000;
        e3.ceo="Gautam";
        e3.showData();
        
        
        
              
    }
}