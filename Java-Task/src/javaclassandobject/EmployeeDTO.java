public class EmployeeDTO {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String jobTitle;
    private double salary;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmployeeId(3559);
        System.out.println("Employee ID : "+employee.getEmployeeId());

        employee.setPhoneNumber(String.valueOf(865654));
        System.out.println("Phone NUmber : "+employee.getPhoneNumber());

        employee.setFirstName("Shabareesh");
        System.out.println("First Name : "+employee.getFirstName());

        employee.setLastName("S");
        System.out.println("Last Name : "+employee.getLastName());

        employee.setEmail("ShabareeshS@gmail.com");
        System.out.println("Email ID : "+employee.getEmail());

        employee.setDepartment("SOFTWARE DEVELOPER");
        System.out.println("Department : "+employee.getDepartment());

        employee.setSalary(100000);
        System.out.println("Salary : "+employee.getSalary());

        employee.setJobTitle("Developer");
        System.out.println("Job Title : "+employee.getJobTitle());
    }
}