import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private int id;
    private String StudentName;
    private int age;
    private Map<String,  Double> courses= new HashMap<>();
    private List<String> Skills= new ArrayList<>();


    public Student(int id, String StudentName, int age, Map<String,Double> courses, List<String> Skills){
        this.id=id;
        this.StudentName= StudentName;
        this.age= age;
        this.courses= courses;
        this.Skills= Skills;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourses(Map<String, Double> courses) {
        this.courses = courses;
    }

    public void setSkills(List<String> skills) {
        Skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Double> getCourses() {
        return courses;
    }

    public List<String> getSkills() {
        return Skills;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                ", Skills=" + Skills +
                '}';
    }
}
