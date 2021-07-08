package pkgstatic;
public class Static1 {
    static int DATA;
    public static void main(String[] args){
        Static1.getData();
        int data=Static1.DATA;
    }
    public static int getData(){
        return 7;
    }
    
}
