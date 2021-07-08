package com.cct.bcis;
import com.cct.bca.*;

public class Runnable {
    public static void main(String[] args) {
        
        //Student Details
        Student ramThapa=new Student();
        Person person=new Person();
        person.fullName="Ram Thapa";
        ramThapa.setSymbolNumber(17512456);
        ramThapa.display(person);
        
        System.out.println(".....................");
        //Person Details
        
        person.setFullName("Suman Tiwari");
        person.display();
     }
}
