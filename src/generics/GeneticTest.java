package generics;
public class GeneticTest {
    public <T> void printArray(T s[]){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args){
        GeneticTest gt=new GeneticTest();
        String name[]=new String[]{"binod","ram","sita"};
        Integer number[]={1,2,3,4,5};
        gt.printArray(name);
        gt.printArray(number);
        
    }
}
