
package string0;
public class buffer {
    public static void main(String[] args){
        //String buffer is thread safe
        StringBuffer sb=new StringBuffer("Ram");
        System.out.println(sb);
        sb.append("hari");
        System.out.println(sb);
        
        //StringBuilder is not thread safe
        StringBuilder sb1=new StringBuilder("Shyam");
        System.out.println(sb1);
        sb1.append("Dhakal");
        System.out.println(sb1);
        
    }
    
}
