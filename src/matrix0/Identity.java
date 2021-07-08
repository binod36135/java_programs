package matrix0;
public class Identity {
    public static void main(String[] args){
        boolean flag=true;
        int a[][]={ {1,0,0},
                    {0,1,0},
                    {0,0,1}};
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                if(i==j){
                    if(a[i][j]!=1){
                        flag=false;
                        break;
                    }
                }else{
                    if(a[i][j]!=0){
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(flag==true){
            System.out.println("Given matrix is indentity");
        }else{
            System.out.println("Given matrix is not indentity"); 
        }
    }
    
}
