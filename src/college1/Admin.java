package college;
public class Admin {
  private String fullName;
  
    //to check the cgpa of student
    public String checkCgpa(Student ramThapa){
        if(ramThapa.getCgpa()>=3){
            return "valid";
        }else{
            return "not valid";
        }
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
}
