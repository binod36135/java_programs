package map2;
import java.util.*;
public class Map2 {
    public static void main(String[] args){
        Map m1=new HashMap();
        m1.put(1, "Binod");
        m1.put(2, "Bijay");
        for(int i=0;i<=2;i++){
            System.out.println(m1.get(i));
        }
    }
    
}
