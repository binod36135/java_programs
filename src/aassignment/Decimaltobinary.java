package aassignment;
public class Decimaltobinary {
    public static void main(String[] args){
        double n=0.75;
       StringBuffer s=new StringBuffer();
        for(int i=0;i<4;i++) {
            n=n*2;
            n=n%1;
        }
        //while(n<=1);
        System.out.println(n);
        
    }
    
}
