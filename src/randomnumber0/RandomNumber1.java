/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber0;
import java.util.Random;
public class RandomNumber1 {
    public static void main(String[] args) {
        int userInput=10;
        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(11)+10;
        if(randomNumber>userInput){
            System.out.println("your input is higher");
        }else if(randomNumber<userInput){
            System.out.println("your input is lower");
        }else{
            System.out.println("you are correct!");
        }
        
        
    }
 }
