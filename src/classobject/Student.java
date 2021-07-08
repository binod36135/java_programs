package classobject;
public class Student {
    private String firstName;
    private String lastName;
    private int symbolNumber;
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    public void setSymbolNumber(int symbolNumber){
        this.symbolNumber=symbolNumber;
    }
    public int getSymbolNumber(){
        return this.symbolNumber;
    }
    
    
}
class A{
    Student s1;
    public A(Student s1){
        this.s1=s1;
    }
    public Student studentInformation(){
        return s1;
    }
   
    
    
}

class Test{
    public static void main(String[] args) {
        Student studentObj;
        Student s1=new Student();
        A a1=new A(s1);
        studentObj=a1.studentInformation();
        studentObj.setFirstName("Binod Bhandari");
        System.out.println(studentObj.getFirstName());
        
        
        
    }
}
