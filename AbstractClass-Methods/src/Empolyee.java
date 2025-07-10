import java.util.Scanner;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method to calculate pay
    public abstract double calculatePay();

    // Concrete method to get employee details
    public String getEmployeeDetails() {
        return "Employee Name: " + name;
    }
}

class HourlyEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    HourlyEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() +
                "\nType: Hourly\nHours: " + hoursWorked +
                "\nRate: $" + hourlyRate;
    }
}

class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() +
                "\nType: Salaried\nSalary: $" + salary;
    }
}

