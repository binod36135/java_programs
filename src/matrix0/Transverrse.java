package matrix0;
import java.util.Scanner;
public class Transverrse {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m1[][]=new int[2][2];
        int tn[][]=new int[2][2];
        int i,j;
        System.out.println("Enter the 2 X 2 matrix");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                m1[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix before transpose is");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The matrix after transpose is");
        for(j=0;j<2;j++){
            for(i=0;i<2;i++){
                System.out.print(m1[j][i]+" ");
            }
            System.out.println();
        }
        
    }
    
}
