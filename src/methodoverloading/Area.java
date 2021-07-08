package methodoverloading;
public class Area{
    public void area(int length, int breadth){
        double areaOfRectangle=length*breadth;
        System.out.println(areaOfRectangle);
         
    }
    public void area(double lenght, double breadth){
        double areaOfRectangle=lenght*breadth;
        System.out.println(areaOfRectangle);
    }
      
    public static void main(String[] args){
        Area a1=new Area();
        a1.area(8,9);
        a1.area(1.2,3.4);
    }
}
   
