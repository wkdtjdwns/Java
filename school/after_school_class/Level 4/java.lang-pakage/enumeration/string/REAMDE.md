# 문자열을 이용한 풀이

- **등급에 문자열을 사용하는 위의 방식은 다음과 같은 문제가 있음.**
    - **타입 안정성 부족: 문자열을 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있음.**
    - **데이터 일관성: “GOLD”, “Gold”, “gold” 등 다양한 형식으로 문자열을 입력할 수 있어서 일관성이 떨어짐.**
    - **컴파일시 오류 감지 불가: 이러한 잘못된 값을 컴파일시에 감지되지 않고, 런타임에서만 문제가 발견되기 때문에 디버깅이 어려움.**
        
        ```java
        package enumeration.ex1;
        
        import enumeration.ex0.DiscountService;
        
        public class StringGradeEx1_2 {
        
            public static void main(String[] args) {
        
                int price = 10000;
                enumeration.ex0.DiscountService discountService = new DiscountService();
        
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
