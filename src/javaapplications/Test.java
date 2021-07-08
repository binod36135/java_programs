package javaapplications;
public class Test {
    public static void main(String[] args){
        Student s1= new Student();
        s1.setFirstName("Binod");
        s1.setLastName("Bhandari");
        s1.setSymbolNubmer(987475869);
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getSymbolNumber());
        s1.display();
        
    }
    
}
