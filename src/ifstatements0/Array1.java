/*
 
 */
package ifstatements0;
public class Array1 {
    public static void main(String[] args) {
        int[] intNumber={34,56};
        if(intNumber[0]>intNumber[1]){
            System.out.println("The greater number is "+intNumber[0]);
        }else if(intNumber[1]>intNumber[0]){
            System.out.println("The greater number is "+intNumber[1]);
        }else{
            System.out.println("The both numbers are saame");
        }
    }
 }
