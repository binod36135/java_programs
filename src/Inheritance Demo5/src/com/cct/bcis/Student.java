package com.cct.bcis;
import com.cct.bca.*;

public class Student{
    private int symbolNumber;
    
    public int getSymbolNumber() {
        return symbolNumber;
    }
    public void setSymbolNumber(int symbolNumber) {
        this.symbolNumber = symbolNumber;
    }
    public void display(Person person){
        System.out.println(
                "Full Name of student class:"+person.fullName+"\n"+
                "Symbol Number of student:"+symbolNumber
  
        );
    }
}
