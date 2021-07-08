/*
String
StringBuffer
StringBuilder
StringTokenizer

String vs StringBuffer:
----------------------------------------
case1:
Both are final class present in java.lang package.

case2:
2-approaches to caeate String object
  a) without using new operator
  b) By using new operator
1-approacher to create StringBuffer object
  a) By using new operator
  */
package string0;
public class Test13 {
    public static void main(String[] args){
        String n1="Binod";
        System.out.println(n1);
        
        String n2=new String("Ram");
        System.out.println(n2);
        
        StringBuffer n3=new StringBuffer("Shyam");
        System.out.println(n3);
    }
    
}
/*
== operator:
reference comparison -----> boolean

case 3
--------------
public class Test14 {
    public static void main(String [] args){
        //Immutable nature:modification is not possible in String class
        String s1="Binod";
        s1.concat("Bhandari");
        System.out.println(s1); //Binod
        
        //Mutable nature: modification is possible.
        StringBuffer s2=new StringBuffer("Binod"+" ");
        s2.append("Bhandari");
        System.out.println(s2); //Binod Bhandari
        
    }
    
}
*/
 
