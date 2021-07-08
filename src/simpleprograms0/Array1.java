package simpleprograms0;
public class Array1 {
    public static void main(String[] args){
        int a[][]={{1,2},{3,4}};
        int b[][]={{5,4},{2,3}};
        int c[][]=new int[2][2];
    for(int i=0; i<2;i++){
        for(int j=0;j<2;j++){
            c[i][j]=a[i][j]+b[i][j];
            System.out.println(c[i][j]);
        }
    }
    }
    
}
