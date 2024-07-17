package level4.test;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee(3000, 500),
                new ContractEmployee(2500),
                new InternEmployee(1500)
        };

        for (Employee employee : employees) {
            employee.printInfo();
        }

        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}

/* 다형성 활용 전
Employee fullTimeEmployee = new FullTimeEmployee(3000, 500);
Employee contractEmployee = new ContractEmployee(2500);
Employee internEmployee = new InternEmployee(1500);

System.out.println("Full Time Employee Salary: " + fullTimeEmployee.calculateSalary());
System.out.println("Contract Employee Salary: " + contractEmployee.calculateSalary());
System.out.println("Intern Employee Salary: " + internEmployee.calculateSalary());

System.out.println();

System.out.println(fullTimeEmployee.toString());
System.out.println(contractEmployee.toString());
System.out.println(internEmployee.toString());
*/
