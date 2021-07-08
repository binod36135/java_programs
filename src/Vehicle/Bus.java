package Vehicle;
public class Bus extends Vehicle {
    private String company;
    private float height;
    private float length;
    private String colour;
    private int engineCC;
    private float cost;
    private int noOfWheel;
    
    @Override
    public float getCost(){
        return cost;
    }
    @Override
    public void setCost(float cost){
        this.cost=cost;
    }
    @Override
    public int getEngineCC(){
        return engineCC;
    }
    @Override
    public void setEngineCC(int engineCC){
        this.engineCC=engineCC;
    }
    @Override
    public String getColour(){
        return colour;
   }
    @Override
    public void setColour(String colour){
        this.colour=colour;
    }
    @Override
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length=length;
    }
    @Override
    public float getHeight(){
        return height;
    }
    @Override
    public void setHeight(float height){
        this.height=height;
    }
    @Override
    public String getCompany(){
        return company;
    }
    @Override
    public void setCompany(String company){
        this.company=company;
    }
     public int getNoOfWheel(){
        return noOfWheel;
    }
    public void setNoOfWheel(int noOfWheel){
        this.noOfWheel=noOfWheel;
        
    }
        
}
