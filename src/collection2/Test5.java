package collection2;
import java.util.ArrayList;
import java.util.List;
public class Test5 {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<Integer>();
        //l.add("Binod");
        l.add(3);
        l.add(7);
        l.add(9);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    
}
