public class Employee {
    private String name;
    private int age;
    private int salary;
    private String department;
    public Employee(String name, int age, int salary, String department){
        this.name= name;
        this.age= age;
        this.salary= salary;
        this.department= department;
    }
    public void setname(String name){
        this.name= name;
    }
    public String getname(){
        return name;
    }
    public void setdepartment(String department){
        this.department= department;
    }
    public String getdepartment(){
        return department;
    }
    public void setage(int age){
        this.age= age;
    }
    public int getage(){
        return age;
    }
    public void setsalary(int salary){
        this.salary= salary;
    }
    public int getsalary(){
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
    }
    
    
}
