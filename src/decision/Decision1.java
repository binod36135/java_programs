package decision;
public class Decision1 {
    //default constructor
    public Decision1(){
        
    }
    //parameterized constructor
    public Decision1(float math, float science, float social, float english, float computer){
        this.math=math;
        this.science=science;
        this.social=social;
        this.english=english;
        this.computer=computer;
        
    }
    //variable declaration
    private float math;
    private float science;
    private float social;
    private float english;
    private float computer;
    private float total;
    private float percent;
    private  String division;
        
    //getter and setter
    public float getMath(){
        return math;
    }
    public void setMath(float math){
        this.math=math;
    }
    public float getScience(){
        return science;
    } 
    public void setScience(float science){
        this.science=science;
    }
    public float getSocial(){
        return social;
    }
    public void setSocial(float social){
        this.social=social;
    }
    public float getEnglish(){
        return english;
    }
    public void setEnglish(float english){
        this.english=english;
    }
    public float getComputer(){
        return computer;
    }
    public void setComputer(float computer){
        this.computer=computer;
    }
    
//to find tatal marks
     public float getTotal(){
           total=math+science+social+english+computer;
           return total;
    }
     public void setTotal(float total){
         this.total=total;
     }
     
//to find percentage
     public float getPercent(){
         percent=total/5;
         return percent;
     }
     public void setPercent(float percent){
         this.percent=percent;
     }
     
//to find division
     public void getDivision(){
         if(percent>=80){
             System.out.println("Distinction");
            }
         else
             if(percent>=60){
                 System.out.println("First Division");
                }
         else
                 if(percent>=45){
                     System.out.println("Second Division");
                }
         else
                     if(percent>=32){
                         System.out.println("Third Division");
                }
         else
                     {System.out.println("Sorry Fail");
                     }
         
     }
     public void setDivision(String division){
         this.division=division;
     }
    
}
