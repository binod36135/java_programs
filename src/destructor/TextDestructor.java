package destructor;
public class TextDestructor {
    private final int firstNumber;
    
    public TextDestructor(int n){
        this.firstNumber=n;
    }
    public int getNumber(){
        return this.firstNumber;
    }
    public static void main(String[] args) {
        TextDestructor obj=new TextDestructor(8);
        System.out.println(obj.getNumber());
        
    }
   
    
}
