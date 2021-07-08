/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list0;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args){
        List list=new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.toString());
                
                
    }
}
