package old.question;
//Write a program in java to calculate a power b using Generic method
public class B4_SendupCCT {
    public static void main(String[] args){
        Generic g=new Generic();
        g.powerCalculate(2,3);
    }
}
class Generic{
       public  <T extends Number> void powerCalculate(T a, int b){
           T power = 1;
           for(int i=1;i<=b;i++){
               power*=a;
            }
           System.out.println(power);
     }
}


