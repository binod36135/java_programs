/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list0;
import java.util.*;
public class List1 {
    public static void main(String[] args){
        List country=new ArrayList();
        country.add("Nepal");
        country.add("India");
        country.add("China");
        country.remove(1);
        System.out.println(country.toString());
    }
  }
