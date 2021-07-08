//Confuse:
package string0;
public class Test15 {
    public static void main(String[] args){
        String name="Binod"; //Heap: String name=new name("Binod");
        //int i=10;
        name="Bhandari";
        //String name=new name("Bhandari");
        System.out.println(name);//Bhandari
    }
    
}
