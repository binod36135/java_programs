/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condition;
public class TriangularOrSquareNumber {
    public static void main(String[] args) {
        class Check{
            int userInput;
            
            public boolean isTriangular(){
                int triangularNumber=0;
                int counter=1;
            
            while(counter <=userInput){
            triangularNumber=triangularNumber+counter;
            counter++;
            }
            if(userInput==triangularNumber){
                return true;
            }else{
                return false;
            }
        }//method closed
             
            public boolean isSquare(){
                int counter=1;
                int sqrNumber=0;
                while(counter<=userInput){
                    sqrNumber=counter*counter;
                    counter++;
                }
                 if(userInput==sqrNumber){
                        return true;
                }else{
                        return false;
                }
                }//method closed
            }//Class closed
        
            
        
        Check obj=new Check();
        obj.userInput=9;
        if(obj.isTriangular()){
            if(obj.isSquare()){
                System.out.println(obj.userInput+" is both triangualr and square number");
            }else{
               System.out.println(obj.userInput+" is triangualar number"); 
            }
        }else if(obj.isSquare()){
           System.out.println(obj.userInput+" is square number"); 
        }else{
            System.out.println(obj.userInput+" is neither triagular nor square");
        }
        }
    }
            
       
    
            
        
    
            
    

