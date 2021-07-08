package decision;
public class Test {
    public static void main(String[] args){
        Decision1 d1=new Decision1(45,67,89,67,87);
        System.out.println(d1.getMath());
        System.out.println(d1.getScience());
        System.out.println(d1.getSocial());
        System.out.println(d1.getEnglish());
        System.out.println(d1.getComputer());
        System.out.println(d1.getTotal());
        System.out.println(d1.getPercent());
        d1.getDivision();
        
    }
    
}
