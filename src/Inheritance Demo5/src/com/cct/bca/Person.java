package com.cct.bca;
public class Person {
    public String fullName;
    
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void display(){
        System.out.println("Full Name of person class"+fullName);
    }
    
}
