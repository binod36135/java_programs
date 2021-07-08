package string0;
public class Test10 {
    public static void main(String[] args){
        String str1="InfoxIt";
        String str2=new String("JAVA");
        char name[]={'B','I','N','O','D'};
        String str3=new String(name);
        String str4=new String(name,2,3);
        String str5=new String(str4);
        System.out.println("\n\t1st String:"+str1);
        System.out.println("\n\t2nd String:"+str2);
        System.out.println("\n\t3rd String:"+str3);
        System.out.println("\n\t4th String:"+str4);
        System.out.println("\n\t5th String:"+str5);
        System.out.println("\n\tLength of First String:"+str1.length());
        
    }
    
}
