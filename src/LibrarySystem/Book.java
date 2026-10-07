package LibrarySystem;

    public class Book extends Member{
    super(name, type, ID, grade, book);
    private String bookname;
    private String bookID;
    private String bookauthor;

    public Book( String bookname, String bookID, String bookauthor){
        this.bookname=bookname;
        this.bookID=bookID;
        this.bookauthor= bookauthor;
    }
    public void setbookname(String bookname) {
        this.bookname = bookname;
    }
    public void setbookID(String bookID) {
        this.bookID = bookID;
    }
    public void setbookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }
    public String getbookname(){
        return bookname;
    }
    public String getbookID(){
        return bookID;
    }
    public String getbookauthor(){
        return bookauthor;
    }
    @Override 
    public String toString(){
    return "Member [name=" + getbookname() +  ", ID=" + getbookID() +", book author=" + getbookauthor() + "]";
    }
    @Override 
    public double CalculateFees(){
        return 0;
    }
}
