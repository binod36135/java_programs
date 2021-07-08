package collection2;
import java.util.ArrayList;
import java.util.List;
public class Test3 {
    public static void main(String[] args){
        List l1= new ArrayList();
        l1.add("Binod");
        l1.add(5);
        l1.add(8);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
    
}
