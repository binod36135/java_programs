package book;
public class NewClass {
    public static void main(String[] args){
        //passing value to object through setter method
        Book b1=new Book();
        b1.setBookName("JAVA");
        b1.setAuthor("Binod");
        b1.setEdition("fifth");
        b1.setCatogory("programming");
        b1.setPageNo(45);
        b1.setActive(true);
        
        System.out.println(b1.getBookName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getEdition());
        System.out.println(b1.getCatogory());
        System.out.println(b1.getPageNo());
        System.out.println(b1.isActive());
       
//passing value to object throuth parameterized constructor.        
Book b2=new Book("JAVA","Binod","fifth","Programming",45,true);
        System.out.println(b2.getBookName());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getEdition());
        System.out.println(b2.getCatogory());
        System.out.println(b2.getPageNo());
        System.out.println(b2.isActive());
    }
    
}
