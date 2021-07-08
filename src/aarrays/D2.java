package aarrays;
class A{
    private int sum;
    public int sumMatrix(int a[][], int b[][]){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
              sum=a[i][j]+b[i][j];  
            }
        }
        
   return sum;
}
}
public class D2 {
    public static void main(String[] args) {
        A a1=new A();
        int a[][]={{1,2},{3,4}};
        int b[][]={{7,8},{5,0}};
        int c[][]=new int[2][2];
        System.out.println("The sum of two matrix is");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                //c[2][2]=a1.sumMatrix(a[i][j],b[i][j]);
            }
        }
        
        System.out.println(c[2][2]);
        
    }
    
}
