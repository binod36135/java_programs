package assign;
public class Assign {
    private String firstName;
    private String lastName;
    
    public void fullName(){
        System.out.println("My full name is :"+firstName+" "+lastName);
    }
    public static void main(String[] args) {
        Assign assign=new Assign();
        assign.firstName="Binod";
        assign.lastName="Bhandari";
        assign.fullName();
    }
    
}
