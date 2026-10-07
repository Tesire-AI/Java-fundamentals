package LibrarySystem;

//import java.util.concurrent.Flow.Publisher;

public class PublisherMember extends Member {
    public PublisherMember(String name, String ID){
        super(name,ID);

        
    }
    public PublisherMember(String name, double flatfee){
        super(name, flatfee);
    }
    @Override 
    public double CalculateFees(){
        return getflatfee() + 0.05*getflatfee() + 20000;
    }
    
}
