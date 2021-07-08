package matrix0;
public class UpperTriangle {
    public static void main(String[] args){
        boolean flag=true;
    
        int a[][]={ {1,2,3},
                    {0,5,6},
                    {1,0,2}};
        
        if((a[1][0]!=0)||(a[2][0]!=0)||(a[2][1]!=0)){
                    flag=false;
                    
                    
                }
        if(flag==true){
            System.out.println("Matrix is UpperTriangular");
        }else{
            System.out.println("Matrix is not uppertriangular");
        }
            }
        }
        
        
    }
   }
    

