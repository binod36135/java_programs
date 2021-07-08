package Hotel;
public class Employee {
    public static void main(String[] args) {
//      System.out.println(args[1]); we can pass arguments from command line.
        Address address=new Address("Palpa", "Betahani");
        Teacher teacher=new Teacher("Ram Thapa", address);
        Interest interest=new Interest();
        interest.setAim("Developer");
        interest.setHobby("Coding");
        teacher.setInterest(interest);
      
        //calling display method
        teacher.display();
    }
    }

class Teacher {
   private String name; 
   private Address address;
   private Interest interest;
   public Teacher(String name, Address address){
       if(name.length()>=25){
           this.name= name+" is not look like name";
       }else{
         this.name=name;    
       }
        this.address=address;
   }
   
   public void setInterest(Interest interest){
       this.interest=interest;
   }
   public Interest getInterest(){
       return interest;
   }
   public String getName(){
       return name;
   }
   public Address getAddress(){
       return address;
    }
  
     public void display(){
               
            System.out.println(
            "Full name:"+name+"\n"+
            "District:"+address.getDistrict()+"\n"+
            "Town:"+address.getTown()+"\n"+
            "Aim:"+interest.getAim()+"\n"+
            "Hobby:"+interest.getHobby()+"\n"
            );
   }
   
}
class Address{
    private String district; 
    private String town;
    public Address(String district, String town){
        String dis=district;
       
        if(dis!=district.replaceAll("[^a-zA-Z0-9]","")){
            System.out.println("please dont use special characters in address");
        }else if(dis!=district.replaceAll("([0-9]+)", "")){
            System.out.println("please don't use numbers in address");
        }else{
              this.district=district;
        }
       this.town=town;
    }
    public String getDistrict(){
        return this.district;
    }
    public String getTown(){
        return this.town;
    }
}
class Interest{
    private String hobby;
    private String aim;
    
    public void setHobby(String hobby){
        this.hobby=hobby;
    }
    public void setAim(String aim){
        this.aim=aim;
    }
    public String getHobby(){
        return this.hobby;
    }
    public String getAim(){
        return this.aim;
    }
}


