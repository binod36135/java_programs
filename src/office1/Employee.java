package office;
public class Employee {
    private String firstName;
    private String lastName;

   public Employee(String firstName, String lastName){
       String fName=firstName;
       if(fName!=firstName.replaceAll("[^a-zA-Z0-9]", "")){
           System.out.println("Name cannot contain special character and blank spaces");
       }else if(fName!=firstName.replaceAll("([0-9]+)","")){
           System.out.println("Name cannot contain any numbers");
       }else{
           this.firstName=firstName;
       }
       
       this.lastName=lastName;
   }
   public String getFirstName(){
       return firstName;
   }

      public String getLastName() {
        return lastName;
    }

    
 }

