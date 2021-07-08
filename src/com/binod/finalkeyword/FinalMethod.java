package com.binod.finalkeyword;
public class FinalMethod {
    //we final method cannot be overridden. 
    public /*final*/ void speed(){
        System.out.println("running");
    }
    
}
class Honda extends FinalMethod{
    @Override
    public void speed(){
        System.out.println("stopped");
    }
    public static void main(String[] args) {
        Honda honda=new Honda();
        honda.speed();
    }
}
