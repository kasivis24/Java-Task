class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

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

    // Overriding + Overloading
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() +
                "\nType: Hourly\nHours: " + hoursWorked +
                "\nRate: $" + hourlyRate;
    }

    public String getEmployeeDetails(boolean includePay) {
        return getEmployeeDetails() +
                (includePay ? ("\nPay: $" + (hoursWorked * hourlyRate)) : "");
    }
}

class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() +
                "\nType: Salaried\nSalary: $" + salary;
    }
}
