package book;
public class Book {
    //default constructor
    public Book(){
        
    }
    //parameterized constructor
    public Book(String bookName,String author,String edition,String catogory, int pageNo, boolean active){
        this.bookName=bookName;
        this.author=author;
        this.edition=edition;
        this.catogory=catogory;
        this.pageNo=pageNo;
        this.active=active;
    }
    //declaring variables
    private String bookName;
    private String author;
    private String edition;
    private String catogory;
    private  int pageNo;
    private boolean active;
    
    //getter and setter
    public boolean isActive(){
        return active;
    }
    public void setActive(boolean active){
        this.active=active;
    }
    public int getPageNo(){
        return pageNo;
    }
    public void setPageNo(int pageNo){
        this.pageNo=pageNo;
    }
    public String getCatogory(){
        return catogory;
    }
    public void setCatogory(String catogory){
        this.catogory=catogory;
    }
    public String getEdition(){
        return edition;
    }
    public void setEdition(String edition){
        this.edition=edition;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    
}
