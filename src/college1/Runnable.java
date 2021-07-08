package college;
public class Runnable {
    public static void main(String[] args) {
        Admin admin=new Admin();
        
        
        Student ramThapa=new Student();
        ramThapa.setCgpa(2.9);
        System.out.println(admin.checkCgpa(ramThapa));
    }
    
}
