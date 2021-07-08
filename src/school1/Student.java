package school;
public class Student extends Employee {
    private int rollNumber;
    
    //initialization is mendetory(depends)
    public Student(int rollNumber, String fullName,Double salary, Address address, DateOfBirth dateOfBirth){
        super(fullName,salary,address, dateOfBirth);
        this.rollNumber=rollNumber;
     
    }
    
    public int getRollNumber(){
        return this.rollNumber;
    }
    
}
