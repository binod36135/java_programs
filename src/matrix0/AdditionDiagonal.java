package matrix0;
import java.util.Scanner;
public class AdditionDiagonal {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m1[][]=new int[2][2];
        int sum=0;
        System.out.println("Enter the 2*2 matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                m1[i][j]=s.nextInt();
                if(i==j){
                    
                    sum=sum+m1[i][j];
                    
                }
                
            }
        }
        System.out.println("sum="+sum);
        
    }
    
}
