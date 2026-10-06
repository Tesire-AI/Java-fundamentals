public class graduateStudent extends Student {
    private double Ta_hours;
    private double yrgrant;
    public graduateStudent(String firstname, String lastname, double Ta_hours, double yrgrant){
        super(firstname, lastname);
        this.Ta_hours= Ta_hours;
        this.yrgrant= yrgrant;
    }
    @Override 
    public double calculatestipend(){
        double Ta_pay= Ta_hours * 25;
        double monthlygrant= yrgrant/12;
        return 1200+ Ta_pay+ monthlygrant;
    }
    
}
