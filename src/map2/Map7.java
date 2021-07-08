package map2;
import java.util.*;
public class Map7 {
    public static void main(String[] args){
        Object1 o1=new Object1();
        o1.setName("meera");
        Object1 o2=new Object1();
        o2.setName("Shyam");
        Object1 o3=new Object1();
        o3.setName("Gopal");
        
               
        Map<Integer,Object1> m1=new HashMap<Integer,Object1>();
        m1.put(1, o1);
        m1.put(2, o2);
        m1.put(3, o3);
        
        Object1 temp=Map.get(2);
        System.out.println(temp.getName());
        
    }
    
}
