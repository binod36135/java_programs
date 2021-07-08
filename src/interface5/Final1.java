package interface5;

interface Dog{
    String eat();
  }
class A implements Dog{
    @Override
    public String eat(){
        return ("eat rice");
    }
}
class Z implements Dog{
        @Override
        public String eat(){
            return("eat meat");
        }
        public String display(){
            return ("display");
        }
    }
public class Final1 {
    public static void main(String[] args) {
      
           A a1[]=new A[10];
           for (int i=0;i<10;i++){
           a1[i]=new A();
           System.out.println(a1[i].eat()); 
           }
           
              
       Z z1=new Z();
       System.out.println(z1.eat());
       System.out.println(z1.display());
     }
}
