package access2;
public class Access1 {
    int i=10;  //default access: within package only.
    public int j=11; //access to all
    protected int k=12; //access in and outside class within inheritance(hierarchy).
    private final int l=13; //access only within class
   public void m1(){
        System.out.println("Value of i,j,k and l in parent class is:" +i+"," +j+"," +k+"," +l);
    }
}

