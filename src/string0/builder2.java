package string0;
public class builder2 {
    public static void main(String[] args){
        StringBuilder sb1=new StringBuilder("anu");
        System.out.println(sb1.length());
        
        StringBuilder sb2=new StringBuilder("Nepal");
        System.out.println(sb2.delete(2, 4));
        
        StringBuilder sb3=new StringBuilder("cct");
        System.out.println(sb3.insert(3, "college"));
        
        StringBuilder sb4=new StringBuilder("college");
        System.out.println(sb4.lastIndexOf("coll"));
        
        StringBuilder sb5=new StringBuilder("Butwal");
        System.out.println(sb5.reverse());
        
        //StringBuilder sb6=new StringBuilder("Kathmadu");
        //System.out.println(sb6.replace(1, 2, "n","l"));
        
        StringBuilder sb7=new StringBuilder("infoxit");
        System.out.println(sb7.toString());
        
        StringBuilder sb8=new StringBuilder("My Village");
        System.out.println(sb8.substring(2));
    }
    
}
    

