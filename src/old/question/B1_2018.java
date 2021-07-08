package old.question;
class Test{
    private int x;
    private float xf;
    private int y;
    private float yf;
    int intResult=1;
    float floatResult=1;
    public void setX(int x){
        this.x=x;
    }
    public void setX(float xf){
        this.xf=xf;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setY(float yf){
        this.yf=yf;
    }
     
    public int getResultInt(){
        
        for(int i=1;i<=y;i++){
            intResult*=x;
            
        }
        return intResult;
    }
    public float getResultFloat(){
        
        for(int i=1;i<=yf;i++){
            floatResult*=xf;
            
        }
        return floatResult;
    }
}
public class B1_2018 {
    public static void main(String[] args){
        Test t1=new Test();
        t1.setX(10);
        t1.setY(4);
        System.out.println(t1.getResultInt());
        t1.setX(2.5f);
        t1.setY(3.5f);
        System.out.println(t1.getResultFloat());
     }
 }




