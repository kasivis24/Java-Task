import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement(){
        this.employees = new ArrayList<>();
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployee(){
        if(employees.isEmpty()){
            System.out.println("There is no such Employee");
        }
        else{
            for(Employee employee : employees){
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagement employee1 = new EmployeeManagement();

        employee1.addEmployees(new Employee(4565,"Shabareesh","S",
                "shabareeshselva@gmail.com",6754656,"Developer",40000,
                "Engineering"));

        employee1.addEmployees(new Employee(6564,"BalaSubramaniyan","K",
                "subramaniyankbala@gmail.com",653467,"Developer",50000,
                "Information"));

        employee1.addEmployees(new Employee(7483,"Mugesh","C",
                "cmugesh000@gmail.com",736347,"Developer",60000,
                "CyberSecurity"));

        employee1.addEmployees(new Employee(6437,"Sathis","C",
                "sathisc@gmail.com",5685590,"DevOps",50000,
                "Engineer"));

        employee1.displayEmployee();
    }
}