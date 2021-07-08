/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map0;
import java.util.*;
public class Map1 {
    public static void main(String[] args){
        Map employee=new HashMap();
        employee.put("java","Binod Bhandari");
        employee.put("Android","Binod Bhandari");
        employee.put("Phython","Bijay Gyawali");
        employee.put("PHP", "Gautam Aryal");
        employee.put("Web","Manju Rana");
        employee.put("Robotics","Shrawan Pnathi");
        employee.remove("PHP");
        System.out.println(employee.get("java"));
        System.out.println(employee.toString());
        System.out.println(employee.get("PHP"));
        
     }
    
}
