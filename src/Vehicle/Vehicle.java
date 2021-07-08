package Vehicle;
public class Vehicle {
    //Declaring variables
    private String company;
    private float height;
    private float length;
    private String colour;
    private int engineCC;
    private float cost;
    private String catogory;
    
    //Default value
    public String getCatogory(){
        return "VEHICLE";
    }
    
    //putting getter and setter
    public float getCost(){
        return cost;
    }
    public void setCost(float cost){
        this.cost=cost;
    }
    public int getEngineCC(){
        return engineCC;
    }
    public void setEngineCC(int engineCC){
        this.engineCC=engineCC;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length=length;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
}
