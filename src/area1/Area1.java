//polimorphism: overloading
package area1;
public class Area1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Area1 a1=new Area1();
        double areaOfSquare=a1.area(9);
        double areaOfCube=a1.area1(3);
    }
    public double area(float length){
        double area=length*length*length;
        return area;
    }
    public double area1(float length){
        double area=length*length;
        return area;
        
    }
}
