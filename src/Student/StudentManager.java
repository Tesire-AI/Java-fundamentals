package Student;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StudentManager {
    List<Student>students= new ArrayList<>();



    public  void displayaverage(){
        for(Student s: students){
            System.out.println(s.average());
        }
    }
    public void specificdepartment(String Department){
        for(Student s:students){
            if(s.getdepartment().equalsIgnoreCase(Department)){
                System.out.println("Student:"+" "+ s.getname());
            }
        }
       }



    public Student highestaverage(){
        Student best= students.get(0);
        for(Student s: students){
            if(s.average()>best.average()){
                best= s;
            }
        }
        return best;
    }
    public int passedall(){
        int count=0;
        for(Student s:students){
            if(s.passedallcourses(s.passmark)){
                return count++;
            }
        }
        return count;
    }
    public double ClassAverage(){
        double sum=0;
        int count=0;
        for(Student s:students){
            for(int i=0;i<s.getmarks().length;i++){
                sum+= s.getmarks()[i];
                 count++;
            }
        }
        return sum/count;
    }
    public double[] aboveclassaverage(){
        int count=0;
        for(Student s: students){
            for(int i=0;i<s.getmarks().length;i++){

                if(s.getmarks()[i]>ClassAverage()){
                     count++;
            }
        }
    }
    int j=0;
    double [] result= new double[count];
    for(Student s: students){
        for(int i=0; i<s.getmarks().length;i++){
            if(s.getmarks()[i]>ClassAverage()){
                result[j]=s.getmarks()[i];
                j++;
            }
        }

        }
        return result;
    }
    public void addstudent(Student s){
         students.add(s);
    }
}
