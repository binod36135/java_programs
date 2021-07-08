package school;
public class Employee {
private String fullName;
private Double salary;
private Address address;
private DateOfBirth dateOfBirth;

//initialization is mendetory(depends on program and situation)
public Employee(String fullName, Double salary, Address address,DateOfBirth dateOfBirth){
    this.fullName=fullName;
    this.salary=salary;
    this.address=address;
    this.dateOfBirth=dateOfBirth;
 }

public String getFullName(){
  return this.fullName;  
}
public double getSalary(){
    return this.salary;
}
public Address getAddress(){
    return this.address;
}
public DateOfBirth getDateOfBirth(){
    return this.dateOfBirth;
}

public String getAddressDistrict(){
    return address.getDistrict();
}
public String getAddressTown(){
    return address.getTown();
}
public int getDateOfBirthDay(){
    return dateOfBirth.getDay();
}
public int getDateOfBirthMonth(){
    return dateOfBirth.getMonth();
}
public int getDateOfBirthYear(){
    return dateOfBirth.getYear();
}
}
