# enumeration

- **고객을 3등급으로 나누고, 상품 구매시 등급별로 할인을 적용함. (단, 할인 시 소수점 이하는 버림.)**
    1. **BASIC: 10% 할인**
    2. **GOLD: 20% 할인**
    3. **DIAMOND: 30% 할인**
    - **회원 등급과 가격을 입력하면 할인 금액을 계산해주는 클래스를 만들어보자.**
    - **예를 들어 GOLD, 10000을 입력하면 할인 대상 금액인 2000을 반환함.**
        
        ---
        
    - **아래의 코드를 활용하여 구현하시오.**
        
        ```java
        package enumeration.ex0;
        
        public class DiscountService {
        
            public int discount() {
                
            }
        }
        ```
        
        ```java
        package enumeration.ex0;
        
        public class StringGradeEx0_1 {
        
            public static void main(String[] args) {
        
                int price = 10000;
                DiscountService discountService = new DiscountService();
        
                int basic = discountService.discount("BASIC", price);
                int gold = discountService.discount("GOLD", price);
                int diamond = discountService.discount("DIAMOND", price);
        
                System.out.println("basic 등급의 할인 금액: " + basic);
                System.out.println("gold 등급의 할인 금액: " + gold);
                System.out.println("diamond 등급의 할인 금액: " + diamond);
            }
        }
        ```
