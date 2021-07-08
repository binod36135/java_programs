package vechicle1;
// *body huna pani saaikxa, nahuna pani sakxa, 
public abstract class VechicleClass implements VehicleInterface {
    @Override
    public float getSpeed(){
        return 45;
    }
    abstract String getDetail();
    
}
