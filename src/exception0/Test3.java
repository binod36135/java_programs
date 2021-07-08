package exception0;
public class Test3 {
    // int j;  we can assign no value inside the class.
    public static void main(String[] args) throws Exception, ArithmeticException{
        int i=10; // int i=10; we must some value to the variable
        int j=0; //primetic data types
        System.out.println("Database conection started");
        int k=0; //check when k=5;
        try{//this is a block so if we declare any variable inside the block will not execute outside the block
            k=i/j; 
            if(k>0){
                throw new Exception();
            }
        }catch(Exception ex){
            System.out.println(ex);
        }finally{//code must be excute whether the work complete or not
            
          System.out.println("Database connection closed");  
        }
        int l=10;
        System.out.println(k);
        System.out.println(l);
    }
    
}
