//Why override
package vehicle1;
public class Bus extends Vehicle1 {
    private float speed;
    @Override
    public float getSpeed(){
        return speed;
    }
    @Override
    public void setSpeed(float speed){
        this.speed=speed;
    }
    @Override
    public float getSpeedLimit(){
        return 90;
    }
    
}
