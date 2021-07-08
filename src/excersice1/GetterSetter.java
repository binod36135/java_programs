package excersice1;
public class GetterSetter {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private String occupation;
    private String qualification;
    private long phoneNumber;
    private String description;
    
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
    
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }
    public String getOccupation(){
        return this.occupation;
    }
    
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public String getQualification(){
        return this.qualification;
    }
    
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return this.description;
    }
    public static void main(String args[]){
        GetterSetter gs=new GetterSetter();
        gs.setFirstName("Binod");
        System.out.println(gs.getFirstName());
        gs.setLastName("Bhandari");
        System.out.println(gs.getLastName());
        gs.setAddress("Butwal");
        System.out.println(gs.getAddress());
        gs.setAge(25);
        System.out.println(gs.getAge());
        gs.setOccupation("Developer");
        System.out.println(gs.getOccupation());
        gs.setQualification("BCA");
        System.out.println(gs.getQualification());
        gs.setPhoneNumber(9867434858l);
        System.out.println(gs.getPhoneNumber());
        gs.setDescription("I had been working as a teacher for 5 years and at present i am Web/Software Developer");
        System.out.println(gs.getDescription());
        
    }
    
}

