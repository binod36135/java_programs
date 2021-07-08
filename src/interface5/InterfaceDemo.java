//Some New features in java 1.8
//Interface in java 1.8
//default and static methods in java.
//My Concept of creating object: 1. Invention 2. Discovery
//Types of interface:
//1.Marker Interface: without any methods 
//2.SAM: Single Abstract method, Functional Interface
//3. Normal
package interface5;
public class InterfaceDemo {
    public static void main(String[] args) {
        NewLaptopConcept nlc1=new Dell();
        nlc1.simSupport();
        nlc1.projectorLamp();
        nlc1.touchKeyboard();
           
        //Annonomous inner class:inner class without name.
        //BoilerPlate Code or Extra Code
        Dell nlc2=new Dell(){
        public void touchKeyboard(){
            System.out.println("processig");  
        }     
    };
        nlc2.touchKeyboard();  
    }
}
//interface
interface NewLaptopConcept{
void projectorLamp();
default void simSupport(){
    System.out.println("Sim is not supported");   
}
void touchKeyboard();
}
//concrete class
class Dell implements NewLaptopConcept{
    public void projectorLamp(){
        System.out.println("Projector Lamp Works");
    }
 
    public void simSupport(){
        System.out.println("sim is supported");
    }
    public void touchKeyboard(){
        System.out.println("touch keyboard is works");
    }

}
