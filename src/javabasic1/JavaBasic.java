package javabasic;

public class JavaBasic {
public static void main(String[] args) {
Teacher t1=new Teacher();
t1.setName("Ram");

System.out.println(t1.getName());

  }
}

class Teacher{
private String name;
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}



}