import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        String answer= "yes";
        while(answer== "yes"){
            System.out.print("\n Select category");
            System.out.println("1. Undergraguate Student");
            System.out.println("2. Graduate");
            System.out.println("---Select the category---");
            int choice=input.nextInt();
            System.out.println("Enter your first name");
            String firstname= input.next();
            System.out.println("Enter your last name");
            String lastname= input.next();

            Student student= new Student(firstname, lastname);

            switch (choice) {
                case 1:
                    System.out.print("enter your gpa:");
                    double gpa= input.nextDouble();
                    student= new UndergraduateStudent(firstname, lastname, gpa);
                    break;
            
                default:
                    System.out.println("enter the hours you assisted in the teaching duties:");
                    double Ta_hours= input.nextDouble();
                    System.out.println("enter your yearly research grant:");
                    double yrgrant= input.nextDouble();
                    student= new graduateStudent(firstname, lastname, Ta_hours, yrgrant);
                    break;
            }

        }
double total=0;
    double stipend= 
    System.out.print(students[i].getfirstname()+students[i].getlastname()+"gets "+ stipend+ "\n $");
    total= total + stipend;
}
    System.out.println("TOTAL: $"+total);
    }
}
