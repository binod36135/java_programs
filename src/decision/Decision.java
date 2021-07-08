package decision;
import java.util.Scanner;
public class Decision {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of seven subjects");
        System.out.println("Math:");
        float math=s.nextFloat();
        System.out.println("English:");
        float english=s.nextFloat();
        System.out.println("Science:");
        float science=s.nextFloat();
        System.out.println("Social:");
        float social=s.nextFloat();
        System.out.println("Nepali:");
        float nepali=s.nextFloat();
        System.out.println("Computer:");
        float computer=s.nextFloat();
        System.out.println("EPH:");
        float eph=s.nextFloat();
        if(math>=32 && english>=32 && science>=32 && social>=32 && nepali>=32 && computer>=32 && eph>=32){
            System.out.println("Congratulation: you are Pass");
            float total=math+english+science+social+nepali+computer+eph;
            float per=total/7;
        if(per>=80){
            System.out.println("Distinction");
        }
        else
            if(per>=60){
                System.out.println("First Division");
        }
        else
                if(per>=45){
                    System.out.println("Second Division");
                }
        else
                    if(per>=32){
                        System.out.println("Third Division");
                    }
                    else{
                        System.out.println("Fail");
                }
        System.out.println("The total is "+ total);
        System.out.println("The percentage is "+per);
        }
        else{
            System.out.println("Sorry: you are Fail");
        }
        
    
}//main close
}//class close
