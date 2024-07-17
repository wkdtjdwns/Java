package level4.test;

public enum EmployeeType {
    FULL_TIME(1.0),
    CONTRACT(0.8),
    INTERN(0.5);

    private final double basu;

    EmployeeType(double basu) {
        this.basu = basu;
    }

    public double adjustBaseSalary(double baseSalary) {
        return baseSalary * basu;
    }
}
