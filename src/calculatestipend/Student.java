public class Student{
    private String firstname;
    private String lastname;
    public Student(String firstname,String lastname){
        this.firstname= firstname;
        this.lastname= lastname;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public double calculatestipend(){
        return 0;
    }
}