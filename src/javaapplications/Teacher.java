package javaapplications;
public class Teacher implements Person {
     public String firstName;
    private String lastName;
    private int phoneNumber;
    
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
    public void setPhoneNubmer(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
     @Override
     public void display(){
        System.out.println(principleName +" is the principle of "+ schoolName);
    }
    
    
}
