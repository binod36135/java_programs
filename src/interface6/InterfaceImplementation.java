package interface6;
public class InterfaceImplementation implements InterfaceDemo {
    public int calculateInterest(int principal, int time){
        return (principal*time*INTEREST_RATE)/100;
    }
    
}
