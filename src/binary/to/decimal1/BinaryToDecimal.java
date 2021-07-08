package binary.to.decimal1;
public class BinaryToDecimal {
    public static void main(String[] args){
        int n=23;
        StringBuilder s=new StringBuilder();
        while(n>0){
            s.append(n%2);
            n=n/2;
            
        }
        System.out.println(s.reverse());
    }
    
}
