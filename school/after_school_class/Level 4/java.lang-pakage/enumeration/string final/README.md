# 문자열 상수을 이용한 풀이

- **문자열 상수를 사용한 덕분에 전체적으로 코드가 더 명확해졌음.**
- **`discount()`에 인자를 전달할 때도 `StringGrade`가 제공하는 문자열 상수를 사용하면 됨.**
    - **만약 실수로 상수의 이름을 잘못 입력하면 컴파일 시점에 오류가 발생함.**
    - **따라서 오류를 쉽고 빠르게 찾을 수 있음.**
    
    ---
    
- **하지만 문자열 상수를 사용해도 지금까지 발생한 문제들은 근본적으로 해결할 수 없음.**
    - **그 이유는 `String` 타입은 어떤 문자열이든 입력할 수 있기 때문임.**
    - **어떤 개발자가 실수로 `StringGrade`에 있는 문자열 상수를 사용하지 않고 아래와 같이 직접 문자열을 사용해도 막을 수 있는 방법이 없음.**
    - **사용해야 하는 문자열 상수가 어디에 있는지 `discount()`를 호출하는 개발자는 알기 어려움.**
    
    ```java
    package enumeration.ex1;
    
    public class StringGradeEx1_2 {
    
        public static void main(String[] args) {
    
            int price = 10000;
            DiscountService discountService = new DiscountService();
    
            // 존재하지 않는 등급
            int vip = discountService.discount("VIP", price);
            System.out.println("vip = " + vip);
    
            // 오타
            int diamond = discountService.discount("DIAMONDD", price);
            System.out.println("diamond = " + diamond);
    
            // 소문자
            int gold = discountService.discount("gold", price);
            System.out.println("gold = " + gold);
        }
    }
    ```
