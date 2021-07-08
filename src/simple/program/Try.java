package simple.program;
class B{
    B(String abc){
        System.out.println("Constructor is called "+abc);
    }
    public void display(){
        System.out.println("B:Display is executed");
    }
}
class C{
    C(B obj){
        obj.display();
    }
    public void display(){
        System.out.println("C:Display is executed");
    }
}
        
public class Try {
    public static void main(String[] args){
        B b1=new B("binod");
        C c1=new C(b1);
        c1.display();
    }
    
}
