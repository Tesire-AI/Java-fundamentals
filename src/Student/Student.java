package Student;

import java.util.Arrays;

public class Student {
    private String name;
    private String department;
    private String id;
    private double[] marks;
    public Student(String id, String name , String department, double[] marks){
        this.id= id;
        this.name= name;
        this.department= department;
        this.marks = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
             this.marks[i] = marks[i];
}


    }
    public void setname(String name){
        this.name= name;
    }
    public void setID(String id){
        this.id= id;
    }
    public void setdepartment(String department){
        this.department= department;
    }
    public void setmarks(double[] marks){
        this.marks= marks;
    }
    public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }
    public String getdepartment(){
        return department;
    }
    public double[] getmarks(){
        return marks;
    }
    public double average(){
        double sum=0; 
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum/marks.length;

    }
    public double highest(){
        double max= marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                marks[i]=max;
            }
        }
        return max;
    }
    public double lowest(){
        double min= marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                marks[i]=min;
            }
        }
        return min;
    }
    double passmark=50.0;
    public boolean passedallcourses(double passmark){

       for(int i=0;i<marks.length;i++){
        if(marks[i]>=passmark){
            return true;
        }
       }
       return false;
    }


    @Override
    public String toString() {
         return "Student [id=" + id + ", name=" + name + ", department=" + department + ", marks=" + Arrays.toString(marks) + "]";
         
    }
    
}
