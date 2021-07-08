package school;
public class Address {
    private String country;
    private String zone;
    private String district;
    private String town;
    
    //initialiazing is mendetary(depends)
    public Address(String district, String town){
        this.district=district;
        this.town=town;
    }
   
    //initilizating value that are not mendentory.
    public void setCountry(String country){
        this.country=country;
    }
    public void setZone(String zone){
        this.zone=zone;
    }
    
    //get method for giving value
    public String getCountry(){
        return this.country;
    }
    public String getZone(){
        return this.zone;
    }
    public String getDistrict(){
        return this.district;
    }
    public String getTown(){
        return this.town;
    }
 }
