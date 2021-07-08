package school;

public class Runnable {

    public static void main(String[] args) {
        Address studentAddress = new Address("Rupandehi", "Betahani");
        studentAddress.setCountry("Nepal");
        studentAddress.setZone("Lumbini");
        DateOfBirth studentDateOfBirth = new DateOfBirth(1, 7, 1994);
        Student student = new Student(1, "Binod Bhandari", 2000.0, studentAddress, studentDateOfBirth);
        //Student Info
        System.out.println("Student Info");
        System.out.println("Roll Numbber:" + student.getRollNumber());
        System.out.println("Full Name:" + student.getFullName());
        System.out.println(".................");
        //System.out.println(s1.getSalary());
        System.out.println("Address");
        System.out.println(".................");
        System.out.println("Town:" + student.getAddressTown());
        System.out.println("District:" + student.getAddressDistrict());
        System.out.println("Zone:" + student.getAddress().getZone());
        System.out.println("Country:" + student.getAddress().getCountry());
        System.out.println(".................");
        System.out.println("Date of Birth");
        System.out.println(".................");
        System.out.println("Day:" + student.getDateOfBirthDay());
        System.out.println("Month:" + student.getDateOfBirthMonth());
        System.out.println("Year:" + student.getDateOfBirthYear());
        System.out.println(".................");
        System.out.println(".................");
        //Employee Info
        Address employeeAddress=new Address("Rupandehi","Motipur");
        DateOfBirth employeeDateOfBirth=new DateOfBirth(24, 8, 1970);
        Employee employee = new Employee("Kapil Mani Dhakal", 40000.0, employeeAddress, employeeDateOfBirth);
        System.out.println("Employee Info");
        System.out.println("Full Name:" + employee.getFullName());
        System.out.println("Salary:" + employee.getSalary());
        System.out.println(".................");
        System.out.println("Address");
        System.out.println(".................");
        System.out.println("Town:" + employee.getAddress().getTown());
        System.out.println("District:" + employee.getAddress().getDistrict());
//        System.out.println("Zone:" + employee.getAddress().getZone());
//        System.out.println("Country:" + employee.getAddress().getCountry());
        System.out.println(".................");
        System.out.println("Date Of Birth");
        System.out.println(".................");
        System.out.println("Day:" + employee.getDateOfBirth().getDay());
        System.out.println("Month:" + employee.getDateOfBirth().getMonth());
        System.out.println("Year:" + employee.getDateOfBirth().getYear());
        System.out.println(".................");

    }
}
