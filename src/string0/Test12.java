/*Class: String, StringBuffer, StringBuilder, StringTokenizer
String are nothing but arrays of characters. String are predefined class present
in java.lang package. String and StringBuffer both are final class. In String class
there are two approach to create an String objects but there is only one approach
to create StringBuffer object. 
String Class: 1) Literal method: String n1="Binod";   takes memory in SCP(String Cons
                                 String n2="Ram";     tant Poul) area. Check pervious
                                 String n3="Binod"    object, if same point to same object
              2) Using New keyword: String n1=new String("Binod");  takes memory in
                                    String n2=new String("Ram");    Heap area.
                                    String n3=new Stirng("Binod");





*/

package string0;
public class Test12 {
    public static void main(String[] args){
        String n1="Binod";
        System.out.println("n1");
        
        String n2=new String("Bhandari");
        System.out.println(n2);
        
        StringBuffer sb1=new StringBuffer("Infox");
        System.out.println(sb1);
        
    }
    
}
