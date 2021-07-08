package aassignment;
public class Matrixaddition {
    public static void main(String[] args){
        int m1[][]={
            {1,2},
            {3,4},
        };
        int m2[][]={
            {5,6},
            {2,1},
        };
        int r[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                   r[i][j]=m1[i][j]+m2[i][j]; 
              }
           }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(r[i][j]+" ");
            }
        }
    }
    
}
