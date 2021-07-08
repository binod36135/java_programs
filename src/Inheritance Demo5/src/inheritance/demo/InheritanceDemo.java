//in this program we should use setter instead of constructor.
//because clild class Telivision do not need to use all property of parent class laptop.
package inheritance.demo;
public class InheritanceDemo {
    public static void main(String[] args) {
        Laptop l1=new DigitalWatch(2,2,32, "red", 5,2,16,720, "face id", 3, 40, 20); 
        System.out.println(l1.getColour());
        System.out.println(l1.getCpuCore());
        Laptop l2=new DigitalWatch(2,6,32, "blue", 5,2,16,720, "face id", 3, 40, 20); 
        System.out.println(l2.getColour());
        System.out.println(l2.getCpuCore());
        Voters v1=new Voters("Binod Bhandari", 2);
        Voters v2=new Voters("Ram Thapa", 20);
        System.out.println(v1.getName());
        System.out.println(v1.getAge());
        System.out.println(v2.getName());
        System.out.println(v2.getAge());
        
}
}
class Laptop{
    private Integer ram; 
    private final Integer cpuCore;
    private Integer storage;
    private final String colour;
    private Integer inch;
    private Integer graphicSize;  
    
    public Laptop(Integer ram, Integer cpuCore, Integer storage, String colour, Integer inch, Integer graphicSize){
        this.ram=ram;
        this.cpuCore=cpuCore;
        this.storage=storage;
        this.colour=colour;
        this.inch=inch;
        this.graphicSize=graphicSize;
        
        }
    public Integer getRam(){
        return this.ram;
    }
    public Integer getCpuCore(){
        return this.cpuCore;
    }
    public Integer getStorage(){
        return this.storage;
    }
    public String getColour(){
        return this.colour;
    }
    public Integer getInch(){
        return this.inch;
    }
    public Integer getGraphicSize(){
        return this.graphicSize;
    }
}
 
class Mobile extends Laptop{
    private Integer megaPixel;
    private Integer resolution;
    private String security;
       
    public Mobile(Integer ram, Integer cpuCore, Integer storage, String colour, Integer inch, Integer graphicSize, Integer megaPixel, Integer resolution, String security ){
        super(ram, cpuCore, storage, colour, inch, graphicSize);
        this.megaPixel=megaPixel;
        this.resolution=resolution;
        this.security=security;
    }
    public Integer getMegaPixel(){
        return this.megaPixel;
    }
    public Integer getResolution(){
        return this.resolution;
    }
    public String getSecurity(){
        return this.security;
    }
    
}
class DigitalWatch extends Mobile{
    private Integer hour;
    private Integer minute;
    private Integer second;
     public DigitalWatch(Integer ram, Integer cpuCore, Integer storage, String colour, Integer inch, Integer graphicSize, Integer megaPixel, Integer resolution, String security, Integer hour, Integer minute, Integer second){
        super(ram, cpuCore, storage, colour, inch, graphicSize, megaPixel, resolution, security);
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
     public Integer getHour(){
         return this.hour;
     }
     public Integer getMinute(){
         return this.minute;
     }
     public Integer getSecond(){
         return this.second;
     }
}
class Television extends Laptop{
    private Integer volume;
     public Television(Integer ram, Integer cpuCore, Integer storage, String colour, Integer inch, Integer graphicSize, Integer volume){
        super(ram, cpuCore, storage, colour, inch, graphicSize);
        this.volume=volume;
    }
     public Integer getVolume(){
         return this.volume;
     }
}
class Tablet extends Mobile{
    private Integer batteryPower;
     public Tablet(Integer ram, Integer cpuCore, Integer storage, String colour, Integer inch, Integer graphicSize, Integer megaPixel, Integer resolution, String security, Integer batteryPower){
        super(ram, cpuCore, storage, colour, inch, graphicSize, megaPixel, resolution, security);
        this.batteryPower=batteryPower;
    }
     public Integer getBatteryPower(){
         return this.batteryPower;
     }
}
class Voters{
    private String name;
    private Integer age;
    
public Voters(String name, Integer age){
    this.name=name;
    if(age>=18){
    this.age=age;
    }else{
        System.out.println("you cannot vote");
    }
}    
public String getName(){
    return this.name;
}
public Integer getAge(){
    return this.age;
}
}

