package excersice1;
public class MatrixAddition {
    public static void main(String[] args){
        try{
           int a[][]={{1,2},{4,3},{5,6}};
           int b[][]={{4,4},{6,5},{2,3}};
           int c[][]=new int[10][10];
        
        for(int i=0;i<=1;i++){
            for(int j=0;i<=1;i++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
            for(int i=0;i<=1;i++){
                for(int j=0;j<=1;j++){
                   System.out.println(c[i][j]); 
                }
                
            }
            
        
        }catch(Exception ex){
            System.out.println(ex);
        }
       
        
    }
    
}
