package LibrarySystem;

public abstract class Member {
    private String name;
    private String ID;
    private double flatfee;
    //private Book book;
    //public Member(String name, int ID, Book book){
       // this.name=name;
       // this.ID=ID;
       // this.book=book;
  //  }
    public Member(String name, String ID, double flatfee){
        this.name=name;
        this.ID=ID;
        this.flatfee=flatfee;
    }
     public Member(String name, String ID){
        this.name=name;
        this.ID=ID;
    }
    public Member(String name, double flatfee){
        this.name=name;
        this.flatfee=flatfee;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String iD) {
        this.ID = iD;
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public double getflatfee(){
        return flatfee;
    }
    @Override
    public String toString() {
        return "Member [name=" + getName() + ", ID=" + getID() + "]";
    }
    public abstract double CalculateFees();

}
