package fruits;
public class Test {
    public static void main(String[] args){
        //properties of fruits goes to fruits itself
        Fruits f1=new Fruits();
        System.out.println(f1.getColour());
        System.out.println(f1.getShape());
        System.out.println(f1.getCost());
        
        //properties of fruits goes to apple
        Fruits f2=new Apple();
        System.out.println(f2.getColour());
        System.out.println(f2.getShape());
        System.out.println(f2.getCost());
        //properties of apple goes to apple itself
        Apple a1=new Apple();
        System.out.println(a1.getFoodType());
        System.out.println(a1.getFamousIn());
               
        //properties of fruits goes to orange
        Fruits f3=new Orange();
        System.out.println(f3.getColour());
        System.out.println(f3.getShape());
        System.out.println(f3.getCost());
        //properties of orange goes to orange itself
        Orange o1=new Orange();
        System.out.println(o1.getFoodType());
        System.out.println(o1.getFamousIn());
        
        //properties of fruits goes to pomegranate
        Fruits f4=new Pomegranate();
        System.out.println(f4.getColour());
        System.out.println(f4.getShape());
        System.out.println(f4.getCost());
        //properties of pomegranate goes to pomegranate
        Pomegranate p1=new Pomegranate();
        System.out.println(p1.getFoodType());
        System.out.println(p1.getFamousIn());
    }
    
}
