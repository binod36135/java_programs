package exception0;
//static method cannot call non-static method
public class Test5 {
    public static void main(String[] args) {
        int i= calculate(10);
        int j= getFinalData(i);
        System.out.println(j);
    }
   static int  calculate(int i){
        return i*i;
    }
   static int  getFinalData(int i){
        int j;
        j=i-10;
        return j;
    }
    
}
