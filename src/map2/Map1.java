package map2;
import java.util.HashMap;
import java.util.Map;
public class Map1 {
    public static void main(String[] args){
        Map m1=new HashMap<>();//Map<Integer,String>m1=new HashMap<Integer,String>();
        m1.put(1,"Hari");//in place of hari we can write 12.5//m1.put("palpa","tansen");
        m1.put(2,"Sita");//in place of sita we can write 45.3 ie, integer 
        for(int i=0;i<=2;i++){
            System.out.println(m1.get(i)); //m1.put(1,object1);, we can pass object
        }
       
    }
    
}
