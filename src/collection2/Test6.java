package collection2;
import java.util.ArrayList;
import java.util.List;
public class Test6 {
    public static void main(String[] args){
        List l2=new ArrayList();
        l2.addAll(8);
        l2.addAll(5);
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i));
        }
    }
    
}
