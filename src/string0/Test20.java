package string0;
public class Test20 {
    public static void main(String[] args){
        String name="RAM";
        //System.out.println(name.indexOf("AM")); output:1, when "R", output:0
        
        int n=50;
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            for(int j=1;j<=i;j++){
                System.out.print(name+" ");
                if(j==n+1-i){
                    break;
                }
            }
            System.out.println();
            }
         }
    }
    

