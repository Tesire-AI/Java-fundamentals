public class UndergraduateStudent extends Student {
    private double gpa;
    public UndergraduateStudent(String firstname,String lastname,double gpa){
        super(firstname,lastname);
        this.gpa= gpa;
    }
    @Override 
    public double calculatestipend(){
        double bonus;
        bonus= (gpa>3.5)?150:0;
        return 500+bonus;
    }
    
}
