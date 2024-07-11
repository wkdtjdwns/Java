# enum - 열거형을 이용한 풀이

- **앞서 본 String처럼 아무 문자열이나 다 사용할 수 있는 것이 아닌, 개발자가 나열한 항목들 즉, BASIC, GOLD, DIAMOND만 사용하게 함.**
    
    **→ 타입 안전 열거형 패턴**
    

---

- **하지만 아래와 같이 새로운 `ClassGrade`의 인스턴스를 만들어서 적용할 수 있음.
→ 생성자를 `private` 처리해줌.**
    
    ```java
    package enumeration.ex2;
    
    public class StringGradeEx2_2 {
    
        public static void main(String[] args) {
    
            int price = 10000;
    
            DiscountService discountService = new DiscountService();
            ClassGrade newClassGrade = new ClassGrade();
            int result = discountService.discount(newClassGrade, price);
            System.out.println("newClassGrade 등급의 할인 금액: " + result);
        }
    }
    ```
    
    ---
    
    ```java
    package enumeration.ex2;
    
    public class ClassGrade {
    
        public static final ClassGrade BASIC = new ClassGrade();
        public static final ClassGrade GOLD = new ClassGrade();
        public static final ClassGrade DIAMOND = new ClassGrade();
    
        private ClassGrade() {}
    }
    ```
    
    ```java
    package enumeration.ex2;
    
    public class StringGradeEx2_2 {
    
        public static void main(String[] args) {
    
            int price = 10000;
    
            DiscountService discountService = new DiscountService();
            /*ClassGrade newClassGrade = new ClassGrade();
            int result = discountService.discount(newClassGrade, price);
            System.out.println("newClassGrade 등급의 할인 금액: " + result);*/
        }
    }
    ```
