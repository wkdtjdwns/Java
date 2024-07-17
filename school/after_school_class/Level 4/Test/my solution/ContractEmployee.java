package level4.test;

public class ContractEmployee implements Employee {
    private double baseSalary;

    public ContractEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.CONTRACT.adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.CONTRACT;
    }

    @Override
    public void printInfo() {
        System.out.println("Contract Employee Salary: " + calculateSalary());
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + getEmployeeType() +
                '}';
    }
}
