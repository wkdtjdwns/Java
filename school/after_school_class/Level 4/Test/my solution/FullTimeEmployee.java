package level4.test;

public class FullTimeEmployee implements Employee {
    private double baseSalary;
    private double bonus;

    public FullTimeEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.FULL_TIME.adjustBaseSalary(baseSalary) + bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.FULL_TIME;
    }

    @Override
    public void printInfo() {
        System.out.println("Full Time Employee Salary: " + calculateSalary());
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
}
