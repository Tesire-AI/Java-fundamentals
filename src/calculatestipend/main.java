public class main {
    public static void main(String[] args) {
        Student[] students = {
    new UndergraduateStudent("Keza","Teta", 3.6),
    new UndergraduateStudent("Rusakara","Brian", 3.5),
    new graduateStudent("Mwiza","Chloe", 20, 6000)
};
double total=0;
for(int i=0; students.length>i; i++){
    double stipend= students[i].calculatestipend();
    System.out.print(students[i].getfirstname()+students[i].getlastname()+"gets "+ stipend+ "\n $");
    total= total + stipend;
}
    System.out.println("TOTAL: $"+total);
    }
}
