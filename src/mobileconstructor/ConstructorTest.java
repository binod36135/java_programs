package mobileconstructor;
public class ConstructorTest {
    private final String firstName; //we can also get output if we dont use final keyword 
    private final String lastName;
    
    public ConstructorTest(String fname, String lname){
        this.firstName=fname;
        this.lastName=lname;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public static void main(String[] args) {
        ConstructorTest o=new ConstructorTest("Binod","Bhandari");
        System.out.println("My full name is :"+ o.getFirstName()+" "+o.getLastName());
    }
}
