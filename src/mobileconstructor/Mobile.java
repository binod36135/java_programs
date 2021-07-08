package mobileconstructor;
public class Mobile {
    //default constructor
   /* public Mobile(){
        
    }
    //parameterized constructor
     public Mobile(String name, int storage, int ram, float cost){
        this.name=name;
        this.storage=storage;
        this.ram=ram;
        this.cost=cost;
    }*/
    //variable declaration
    private String name;
    private int storage;
    private int ram;
    private float cost;
    
    //getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage=storage;
    }
    public float getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
 
   
}
