# 문제 설명

- 회사에서 다양한 종류의 직원(Employee) 유형을 관리하는 시스템을 개발하고 있다. 이 시스템에서는 각 직원의 유형에 따라 다른 월급 계산 방식을 사용한다.
- 직원의 유형은 정규직(FULL_TIME), 계약직(CONTRACT), 인턴(INTERN)으로 구분된다.
- 각 직원 유형에 따라 최종 월급을 계산하여 출력하는 프로그램을 생성하시오.
- java-test 프로젝트 생성 후 level4.test 패키지에 작업하시오.

# 요구사항

1. 직원 유형별 월급 계산 방식
    - 정규직(FULL_TIME) 직원: 기본급(baseSalary)과 보너스(bonus)를 더한 금액을 월급으로 받는다.
    - 계약직(CONTRACT) 직원: 기본급(baseSalary)만 월급으로 받는다.
    - 인턴(INTERN) 직원: 기본급(baseSalary)만 월급으로 받는다.

1. 각 직원별 기본급 배수
    - 정규직은 기본급의 1.0 배수를 적용받는다.
    - 계약직은 기본급의 0.8 배수를 적용받는다.
    - 인턴은 기본급의 0.5 배수를 적용받는다.
    - 최종 기본급 = 기본급 * 배수

1. EmployeeType 이라는 enum 생성
    - 직원 유형 FULL_TIME, CONTRACT, INTERN 으로 구분한다.
    - 직원 유형별 기본급 배수를 적용한다.
    - 기본급 배수에 따라 기본급을 조정하는 adjustBaseSalary 메서드를 생성한다.

1. Employee 라는 interface 를 정의하고, 다음 메서드를 선언해라.
    - double calculateSalary(); - 직원의 월급을 계산하는 메서드이다.
    - EmployeeType getEmployeeType(); - 직원의 유형을 반환하는 메서드이다.

1. 각 직원 유형에 대한 클래스를 정의하고, Employee 인터페이스를 구현하여라. 각 클래스는 다음과 같은 필드를 가진다.
    - double baseSalary; - 기본급(모두 해당)
    - double bonus; - 보너스(정규직 직원만 해당)

1. 각 클래스는 calculateSalary 메서드를 구현하여 직원의 월급을 계산해야 한다.

1. 다음 메인 메서드를 참고하여, 나머지 모두 구현하여라.
    - TestEmployee.java
        
        ```java
        public class TestEmployee {
            public static void main(String[] args) {
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
            }
        }
        ```
        
    - 출력 결과
        
        ```
        Full Time Employee Salary: 3500.0
        Contract Employee Salary: 2000.0
        Intern Employee Salary: 750.0
        
        FullTimeEmployee{baseSalary=3000.0, bonus=500.0, employeeType=FULL_TIME}
        ContractEmployee{baseSalary=2500.0, employeeType=CONTRACT}
        InternEmployee{baseSalary=1500.0, employeeType=INTERN}
        ```
        
    - 생성해야 하는 클래스들
        1. interface Employee
        2. enum EmployeeType
        3. class FullTimeEmployee implements Employee
        4. class ContractEmployee implements Employee
        5. class InternEmployee implements Employee

1. TestEmployee.java를 중복을 제거하고 다형성을 활용할 수 있게 변경하시오.
