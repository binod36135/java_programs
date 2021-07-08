/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classobject;
public class ClassAndObject {
    public static void main(String[] args) {
        class User{
            int score;
            public boolean hasMon(){
               if(score>=100){
                    return true;
        }else{
                    return false;
        } 
        }
            
            
        }
        User binod=new User();
        binod.score=200;
        System.out.println(binod.hasMon());
        
    }
    
}
