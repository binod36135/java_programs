package string0;
public class Test3 {
    public static void main(String[] args){
        char[] n={'B','I','N','O','D'};
        String name=new String(n);
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
            for(int j=1;j<=i;j++){
                System.out.print(name+" ");
            }
            System.out.println();
            
        }
        
        
    }
    
}
