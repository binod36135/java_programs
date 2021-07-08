package office;
public class Runnable {
     public static void main(String[] args) {
        Employee ramThapa=new Employee("Ram", "Thapa");
        Employee bijayGyawali=new Employee("Bijay", "Gyawali");
        Employee sumanTiwari=new Employee("Suman", "Tiwari");
        
        
        //Info of Ram Thapa
        System.out.println("Ram Thapa info");
        System.out.println("First Name:"+ramThapa.getFirstName());
        System.out.println("Last Name:"+ramThapa.getLastName());
        
        //Info of Bijay Gyawali
        System.out.println("Bijay Gyawali info");
        System.out.println("First Name:"+bijayGyawali.getFirstName());
        System.out.println("Last Name:"+bijayGyawali.getLastName());
        
        //Info of Suman Tiwari
        System.out.println("Suman Tiwari info");
        System.out.println("First Name:"+sumanTiwari.getFirstName());
        System.out.println("Last Name:"+sumanTiwari.getLastName());
   }
 }
