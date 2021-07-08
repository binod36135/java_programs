package string0;
public class Test21 {
    public static void main(String[] args){
        String name="Binod Bhandari";
        System.out.println(name.charAt(1));
        
        String address="Butwal";
        System.out.println(address.equalsIgnoreCase("BUTWAL"));
        
        String mob="Mobile";
        System.out.println(mob.length());
        
        String color="Yellow";
        System.out.println(color.toUpperCase());
        
        String body="SLIM";
        System.out.println(body.toLowerCase());
        
        String animal="Elephant";
        System.out.println(animal.concat("Animal"));
        
        String bird="parrot";
        System.out.println(bird.getBytes());
        
        String girl="Asmita";
        System.out.println(girl.endsWith("i"));
        
        String boy="Rambilash";
        System.out.println(boy.contentEquals("rambilash"));
        
        String country="Nepal";
        System.out.println(country.codePointBefore(5));
        
        String city="kathmandu";
        System.out.println(city.replace("kathmandu", "Butwal"));
        
        String town="Pharsatikar";
        System.out.println(town.isEmpty());
        
        String village="Betahani";
       String arry[] = village.split("a");
        for(int i=0;i<arry.length;i++){//In this case length=3
          System.out.println(arry[i]);  
        }
        //System.out.println();
        
        
        String bag="laptopbag";
        System.out.println(bag.startsWith("p", 2));
        
        String college="ButwalMultiple";
        System.out.println(college.equals("Butwal"));
        
        String book=" java  ";
        System.out.println(book.trim());
                      
        }
    
}
