package map2;
import java.util.*;
public class Map4 {
    public static void main(String[] args){
        Map m1=new HashMap();
        m1.put(1, 12.5);
        m1.put(2, 15.5);
        for(int i=1;i<=2;i++){
            System.out.println(m1.get(i));
        }
    }
    
}
