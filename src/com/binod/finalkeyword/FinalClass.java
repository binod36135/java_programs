package com.binod.finalkeyword;
//final class cannot be inherited
public /*final*/ class FinalClass {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String address;
    private long  phoneNumber;
    
    public void setFirstName(String name){
        this.firstName=name;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
     public void setMiddleName(String name){
        this.middleName=name;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    
     public void setLastName(String name){
        this.lastName=name;
    }
    public String getLastName(){
        return this.lastName;
    }
    
     public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    
     public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    
     public void setPhoneNumber(long number){
        this.phoneNumber=number;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
       
}
class Child extends FinalClass{
    public void myTitle(){
        System.out.println("I LOVE CODE");
    }
    }
 class Test1{
    public static void main(String[] args) {
        Child child=new Child();
        
        child.setFirstName("Binod");
        child.setMiddleName("Kumar");
        child.setLastName("Bhandari");
        child.setAddress("Butwal");
        child.setPhoneNumber(980740243);
        child.setAge(25);
        
        child.myTitle();
        System.out.println(child.getFirstName());
        System.out.println(child.getMiddleName());
        System.out.println(child.getLastName());
        System.out.println(child.getAddress());
        System.out.println(child.getAge());
        System.out.println(child.getPhoneNumber());
    }
}
