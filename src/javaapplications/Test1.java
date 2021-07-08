package javaapplications;
public class Test1 {
    public static void main(String args[]){
        Teacher t1=new Teacher();
        t1.setFirstName("Jeevan");
        t1.setLastName("Acharya");
        t1.setPhoneNubmer(986788767);
        System.out.println(t1.getFirstName());
        System.out.println(t1.getLastName());
        System.out.println(t1.getPhoneNumber());
        t1.display();
    }
}
