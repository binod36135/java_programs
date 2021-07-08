package matrix0;
import java.util.Scanner;
public class Addition2 {
    public static void main(String[] args){
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            a[i][j]=s.nextInt();  
            }
        }
        System.out.println("Enter the second matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j]=s.nextInt();
            }
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
           }
        }
        System.out.println("The sum of two matrix is :");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
              System.out.println(c[i][j]+" ");  
            }
        }
                
    }
    
}
