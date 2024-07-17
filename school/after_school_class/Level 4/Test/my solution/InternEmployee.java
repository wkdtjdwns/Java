package level4.test;

public class InternEmployee implements Employee {
    private double baseSalary;

    public InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.INTERN.adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.INTERN;
    }

    @Override
    public void printInfo() {
        System.out.println("Intern Employee Salary: " + calculateSalary());
    }

    @Override
    public String toString() {
        return "InternEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
}
