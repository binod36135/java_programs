package area;
public class Circle {
        public static void main(String[] args) {
        Circle c1=new Circle();
        double areaOfCircle=c1.area(45);
        double areaOfRectangle=c1.area(4,5);
          }
        
    public double area(float radius){
        double area= 3.14*radius*radius;
        return area;
    }
    public double area(float length, float breadth){
        double area=length*breadth;
        return area;
    }
    
}
