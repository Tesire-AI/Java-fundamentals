package LibrarySystem;

public class LibrarianMember extends Member {
    public LibrarianMember(String name, String ID){
        super(name, ID);

    }
    public LibrarianMember(String name, double flatfee){
        super(name, flatfee);
    }

    @Override 
    public double CalculateFees(){
        return 0;
    }
    
}
