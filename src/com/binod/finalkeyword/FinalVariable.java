package com.binod.finalkeyword;
public class FinalVariable {
    private /*final*/ int speedLimit;
    
    
    public void setSpeedLimit(int x){
        this.speedLimit=x;
    }
    public int getSpeedLimit(){
        return this.speedLimit;
    }
   /*
    public void change(){
        speedLimit=400;
        System.out.println(speedLimit);
    }
   */ 
}
class Test{
    public static void main(String[] args) {
        FinalVariable obj=new FinalVariable();
        obj.setSpeedLimit(5);
        System.out.println(obj.getSpeedLimit());
    }
 
}
