/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobject;
public class PositiveOrNegative {
    public static void main(String[] args) {
        class Number{
            int userInput;
            public boolean positiveNumber(){
                if(userInput>0){
                    return true;
                }else{
                    return false;
                }
            }
          }
         Number obj=new Number();
            obj.userInput=5;
            if(obj.positiveNumber()){
                System.out.println(obj.userInput+" is positive");
            }else{
                System.out.println(obj.userInput+" is negative");
            }
     }
 }
