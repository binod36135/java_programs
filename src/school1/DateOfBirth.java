package school;
public class DateOfBirth {
    private int day;
    private int month;
    private int year;
    
    //initialization are mendentary, so we use constructor.
    public DateOfBirth(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
        
    }
    
    //getter method to get values.
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    
}
