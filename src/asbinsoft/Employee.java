package asbinsoft;
public class Employee {
   private String name;
   private String address;
   private int age;
   private String cast;
   public String getCast(){
       return cast;
   }
   public void setCast(String cast){
       this.cast=cast;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
   public String getAddress(){
       return address;
   }
   public void setAddress(String address){
       this.address=address;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
    public String getWork(){
        return "Farming";
    }
}
