package Student;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        StudentManager manager= new StudentManager();
        manager.addstudent(new Student("101","Frank", "Software", new double[]{45,65,78,91,89} ));
        manager.addstudent(new Student("102","Bana", "Networking", new double[]{55,37,88,61,46} ));
        manager.addstudent(new Student("103","Bill", "Law", new double[]{65,28,49,69,70} ));
        manager.addstudent(new Student("104","Ganza", "Intetnational Relations", new double[]{75,55,73,78,30} ));
        manager.addstudent(new Student("105","Ryan", "Information Management", new double[]{80,60,70,90,80} ));
        manager.addstudent(new Student("106","Husna", "Applied sciences", new double[]{77,63,92,41,56} ));
        manager.addstudent(new Student("107","Pierrot", "Biomedical Engineering", new double[]{95, 88, 91, 84, 97} ));
        manager.addstudent(new Student("108","Nella", "Architecture", new double[]{55, 60, 58, 62, 70} ));
        manager.addstudent(new Student("109","Kessia", "Chemical Engineering", new double[]{85, 90, 88, 92, 79} ));
        manager.addstudent(new Student("110","Daisy", "ACCA", new double[]{100, 45, 75, 65, 55} ));
        manager.addstudent(new Student("111","Lisa", "Computer science", new double[]{66, 70, 74, 69, 71} ));
        manager.addstudent(new Student("112","Milka", "Software", new double[]{78, 82, 85, 90, 88} ));
        manager.addstudent(new Student("113","Marvella", "Software", new double[]{40, 55, 48, 60, 52} ));
        manager.addstudent(new Student("114","Candella", "Data science", new double[]{46, 80, 64, 59, 31} ));
        manager.addstudent(new Student("115","Husnah", "Software", new double[]{45, 10, 68, 72, 32} ));


        //the list operations

        System.out.println("******Student's details*****");
        //for(Student s: manager.students){
          //  System.out.println(s);
        //}
        //System.out.println(" ");
      //  System.out.println("the averages:");
       // manager.displayaverage();
      manager.specificdepartment("software");
            }
        }

        
    
