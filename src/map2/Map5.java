package map2;
import java.util.*;
public class Map5 {
    public static void main(String[] args){
        Map<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(1,"Ram");
        m1.put(2, "Raju");
        for(int i=1;i<=2;i++){
            System.out.println(m1.get(i));
        }
    }
    
}
