package LibrarySystem;

public class StudentMembers extends Member {
    public StudentMembers(String name, String ID){
        super(name, ID);

    }
    public StudentMembers(String name, double flatfee){
        super(name, flatfee);
    }
    @Override 
    public double CalculateFees(){
        return (getID()!= null && !getID().isEmpty())? 0 : 5000;

    }
    
}
