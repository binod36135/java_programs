/*objects are the generic type of variables that contain every type of datatypes. 
 */
package list0;

import java.util.ArrayList;
import java.util.List;

public class AddPeople {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Binod");
        list.add("Asmita");
        list.add("Bijay");
        list.add("Anu");
        for(String name:list){
           System.out.println(name); 
        }
        
    }
    
}
