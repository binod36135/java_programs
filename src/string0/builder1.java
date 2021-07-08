package string0;
public class builder1 {
    public static void main(String[] args){
        StringBuffer sb1=new StringBuffer("anu");
        System.out.println(sb1.length());
        
        StringBuffer sb2=new StringBuffer("Nepal");
        System.out.println(sb2.delete(2, 4));
        
        StringBuffer sb3=new StringBuffer("cct");
        System.out.println(sb3.insert('l', sb3));
        
       // StringBuffer sb4=new StringBuffer("college");
       // System.out.println(sb4.lastIndexOf('coll'));
        
        StringBuffer sb5=new StringBuffer("Butwal");
        System.out.println(sb5.reverse());
        
        //StringBuffer sb6=new StringBuffer("Kathmadu");
       // System.out.println(sb6.replace(1, 2, 'n','l'));
        
        StringBuffer sb7=new StringBuffer("infoxit");
        System.out.println(sb7.toString());
        
        StringBuffer sb8=new StringBuffer("My Village");
        System.out.println(sb8.substring(2));
    }
    
}
