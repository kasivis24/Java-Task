package javaconstructor;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private String jobTitle;
    private double salary;
    private String department;

    public Employee(int employeeId,String firstName,String lastName, String email,long phoneNumber,String jobTitle,double salary,String department){
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
    }

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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
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

    @Override
    public String toString(){
        return "Employee[employeeId = "+ employeeId + ", firstName = "+ firstName + ", lastName = " +lastName +
        ",email = " + email + ", phoneNumber = " +phoneNumber + ", jobTitle = " + jobTitle + ", Salary = " + salary+ ", " +
                " Department = " + department + "]";
    }
}