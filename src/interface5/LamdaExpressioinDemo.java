package interface5;
public class LamdaExpressioinDemo {
    public static void main(String[] args) {
    //lamda expression   
    Mobile m1=()->{System.out.println("success");};
    
    m1.handWrittenScanning();
    }
}
interface Mobile{
    public abstract void handWrittenScanning();
}
