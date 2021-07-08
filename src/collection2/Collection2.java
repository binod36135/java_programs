package Collection2;
import java.util.ArrayList;
import java.util.List;


public class Collection2 {
    public static void main(String[] args){
        List l1=new ArrayList();//list is interface and ArrayList is a class.
        l1.add(10);//RHS ma vako class hunxa
        l1.add(20);//LHS ma vako interface or class hunxa.
        l1.add(30);
        l1.add("ram");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
    
}
