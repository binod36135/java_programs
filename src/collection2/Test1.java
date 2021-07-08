package collection2;
import java.util.ArrayList;
import java.util.List;
//import java.util.*;
public class Test1 {
    public static void main(String[] args){
       List<Integer> l2=new ArrayList<Integer>();
        l2.add(2);
        l2.add(3);
        l2.add(4);
        //l2.add("shyam");
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i));
        }
    }
    
}
