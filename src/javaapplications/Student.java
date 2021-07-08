package javaapplications;
public class Student implements Person {
    public String firstName;
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
    public void setSymbolNubmer(int symbolNumber){
        this.symbolNumber=symbolNumber;
    }
    public int getSymbolNumber(){
        return this.symbolNumber;
    }
    @Override
    public void display(){
        System.out.println(principleName +" is the principle of "+ schoolName);
    }
    
}
