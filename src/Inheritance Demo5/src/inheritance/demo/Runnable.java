package inheritance.demo;
public class Runnable {
    public static void main(String[] args){
        Person p=new Person();
        Student s=(Student)p;
        s.setRollNo(5);
        System.out.println(s.getRollNo());
        }
    }  

class Person{
   private String name;
   private Integer age;
       
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return this.name;
   }
   public void setAge(Integer age){
      this.age=age;
   }
   public Integer getAge(){
       return this.age;
   }
      
}
class Student extends Person{
    private Integer rollNo;
    
    public void setRollNo(Integer rollNo){
        this.rollNo=rollNo;
    }
    public Integer getRollNo(){
        return this.rollNo;
    }
    
}
class Employee extends Student{
    
}
