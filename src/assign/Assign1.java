package assign;
public class Assign1 {
    private String firstName;
    private String lastName;
    
    public void setFirstName(String name){
        this.firstName=name;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String name){
        this.lastName=name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public static void main(String[] args) {
        Assign1 assign=new Assign1();
        
        assign.setFirstName("Binod");
        assign.setLastName("Bhandari");
        
        System.out.print("My full name is :"+assign.getFirstName()+" ");
        System.out.println(assign.getLastName());
        
    }
    
}
