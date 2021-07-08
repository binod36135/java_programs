package vehicle1;

public class Vehicle1 {
private String color;
private int WheelCount;
private String company;
private float engine;
private float speed;
public  float getSpeed(){
    return speed;
}
public void setSpeed(float speed){
  this.speed=speed;  
}
public float getEngine(){
    return engine;
}
public void setEngine(float engine){
    this.engine=engine;
}
public String getCompany(){
    return company;
}
public void setCompany(String company){
    this.company=company;
}
public int getWheelCount(){
    return WheelCount;
}
public void setWheelCount(int WheelCount){
    this.WheelCount=WheelCount;
}
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color=color;
}
public float getSpeedLimit(){//why we make method getSpeedLimit, why not speedlimit()
    return 40; //if get why not set
}
       
    
}
