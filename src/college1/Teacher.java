package college;

public class Teacher extends office.Employee{
 private int id;
  
  public Teacher(String firstName, String lastName){
   super(firstName, lastName);   
  }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void display(){
        System.out.println(
                "Teacher id"+id+"\n"+
                "Teacher First Name"+super.getFirstName()+"\n"+
                "Teacher Last Name"+super.getLastName()+"\n"
        );
    }
}