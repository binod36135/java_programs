package collection2;
import java.util.ArrayList;
import java.util.List;
public class Test7 {
    public static void main(String[] args){
        List l2=new ArrayList();
        l2.add("Ram");
        l2.add("binod");
       // l2.clear();
        l2.add(2);
        l2.add(5);
        l2.clear();
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i));
        }
        
    }
}
