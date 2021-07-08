package matrix0;
public class Multiplication {
    public static void main(String[] args){
        int a[][]={ {1,2,3},
                    {5,6,7},
                    {6,4,5}};
        int b[][]={ {3,2,4},
                    {5,3,1},
                    {2,1,5}};
        int c[][]=new int[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                for(int k=0;k<=2;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.println(c[i][j]);
        }
    }
    
}
}
