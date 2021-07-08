package saurav_sukla;
public class Student {
    
    public static void main(String[] args){
        SeniorStudent ramThapa=new SeniorStudent();
        SeniorStudent binodBhandari; //=new SeniorStudent();
        SeniorStudent aakuBhandari; //=new SeniorStudent();
        ramThapa.setName("Ram Thapa");
        ramThapa.setAddress("Butwal");
        ramThapa.setAge(25);
        ramThapa.setMarks(25.5f);
        ramThapa.setPhoneNumber(95846235154l);
        binodBhandari=ramThapa;
        aakuBhandari=ramThapa;
        System.out.println(binodBhandari.getName());
        System.out.println(aakuBhandari.getAddress());
        
        
    }
    
    
}
class SeniorStudent{
    private String name;
    private String address;
    private int age;
    private float marks;
    private long phoneNumber;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
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
    public void setMarks(float marks){
        this.marks=marks;
    }
    public float getMarks(){
        return this.marks;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
}
class Teacher{
    private String name;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
class Person{
    public static void main(String[] args){
        Teacher ramThapa=new Teacher();
        ramThapa.setName("Binod");
        System.out.println(ramThapa.getName());
    }
}