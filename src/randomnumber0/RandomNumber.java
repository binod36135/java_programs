/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber0;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(10);
        System.out.println(randomNumber);
    }
}
