# 타입 안전 열거형 패턴(Type-Safe Enum Pattern)

- **장점**
    - **타입 안정성 형성: 정해진 객체만 사용할 수 있기 때문에 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있음.**
    - **데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장됨.**
    
    ---
    
- **단점**
    - **많은 코드를 작성해야 함.**
    - **생성자를 private 처리 해줘야 함.**
    
    ---
    
- **하지만 위와 같은 단점들을 java가 해결해줌!**
    - **아래와 같이 `enum`을 사용해서 정말 간단하게 만들 수 있음.**
    
    ```java
    package enumeration.ex3;
    
    public enum Grade {
        BASIC, GOLD, DIAMOND
        // 열거형을 정의할 때는 class 대신에 enum을 사용함.
        // 원하는 상수의 이름을 나열하면 됨.
        // enum 열거형도 클래스임.
        // 열거형은 자동으로 java.lang.Enum을 상속 받음.
        // -> 다른 클래스 상속 불가능 -> 인터페이스를 사용해야 함.
    }
    ```
    
    ---
    
- **위와 같이 자바는 타입 안전 열거형 패턴을 매우 편리하게 사용할 수 있는 열거형(Enum Type)을 제공함.**
- **`enum`은 enumeration의 줄임말이며, 번역하면 열거라는 뜻이 되고, 어떤 항목을 나열하는 것을 의미함.**
- **Enumeration은 일련의 명명된 상수들의 집합을 정의하는 것을 의미하며, 프로그래밍에서는 이러한 상수들을 사용하여 코드 내에서 미리 정의된 값들의 집합을 나타냄.**
- **쉽게 이야기해서 회원의 등급은 상수로 정의한 BASIC, GOLD, DIAMOND만 사용할 수 있다는 뜻임.**
- **자바의 `enum`은 타입 안전성을 제공하고, 코드의 가독성을 높이며, 예상 가능한 값들의 집합을 표현하는 데 사용됨.**
  
    ---
    
    ```java
    package enumeration.ex3;
    
    public class EnumRefMain {
    
        public static void main(String[] args) {
            System.out.println("class BASIC = " + Grade.BASIC.getClass());
            System.out.println("class GOLD = " + Grade.GOLD.getClass());
            System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
    
            /*class BASIC = class enumeration.ex3.Grade
            class GOLD = class enumeration.ex3.Grade
            class DIAMOND = class enumeration.ex3.Grade*/
            
            System.out.println("ref BASIC = " + refValue(Grade.BASIC));
            System.out.println("ref GOLD = " + refValue(Grade.GOLD));
            System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
            
            /*ref BASIC = 4e50df2e
            ref GOLD = 1d81eb93
            ref DIAMOND = 7291c18f*/
        }
    
        // 다형성 활용
        private static String refValue(Object grade) {
            // System.identityHashCode(): 자바가 관리하는 객체의 참조값을 주소로 줌.
            // Integer.toHexString(): 숫자를 16진수로 바꿔줌. (일반적으로 확인하는 참조값: 16진수)
            return Integer.toHexString(System.identityHashCode(grade));
        }
    }
    ```
    
    ---
    
    - **위의 실행 결과를 보면 상수들이 열거형으로 선언한 타입인 Grade 타입을 사용하는 것을 볼 수 있음.**
    - **그리고 각각의 인스턴스도 서로 다른 것을 확인할 수 있음.**
    - **참고로 열거형은 `toString()`을 오버라이딩 하기 때문에 참조값을 확인할 수 없어서 참조값을 확인하기 위해 `refVale()`를 생성했음.**
    - **열거형도 클래스임. 열거형을 제공하기 위해 제약이 추가된 클래스라 생각하면 편함.**
    - **또한 Enum 열거형은 `if`를 `switch`로 변경해서 사용이 가능함.**
        
        ---
        
    
    ```java
    package enumeration.ex3;
    
    public class DiscountService {
    
        public int discount(Grade grade, int price) {
            int discountPercent = 0;
    
            // enum은 if를 switch로 변경이 가능함.
            if (grade == Grade.BASIC) {
                discountPercent = 10;
            }
    
            else if (grade == Grade.GOLD) {
                discountPercent = 20;
            }
    
            else if (grade == Grade.DIAMOND) {
                discountPercent = 30;
            }
    
            else {
                System.out.println("할인X");
            }
    
            return price * discountPercent / 100;
        }
    }
    ```
    
    ```java
    package enumeration.ex3;
    
    public class EnumEx3_1 {
    
        public static void main(String[] args) {
            int price = 10_000;
    
            DiscountService discountService = new DiscountService();
            int basic = discountService.discount(Grade.BASIC, price);
            int gold = discountService.discount(Grade.GOLD, price);
            int diamond = discountService.discount(Grade.DIAMOND, price);
    
            System.out.println("basic = " + basic);
            System.out.println("gold = " + gold);
            System.out.println("diamond = " + diamond);
        }
    }
    ```

    ---

    ```java
    package enumeration.ex3;
    
    public class EnumEx3_2 {
    
        public static void main(String[] args) {
            int price = 10_000;
    
            DiscountService discountService = new DiscountService();
    
            // Grade myGrade = new Grade(); // enum은 객체 생성이 불가능함.
            // enum은 열거형 내부에서 상수로 지정하는 것 이외에 직접 생성이 불가능함.
            // 생성할 경우에는 컴파일 오류가 발생함.
        }
    }
    ```

    ---

# **타입 안전 열거형 패턴(Type-Safe Enum Pattern)**

---

- **장점**
    - **타입 안정성 형성: 정해진 객체만 사용할 수 있기 때문에 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있음.**
    - **데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장됨.**
    
    ---
    
- **단점**
    - **많은 코드를 작성해야 함.**
    - **생성자를 private 처리 해줘야 함.**
    
    ---
    
- **하지만 위와 같은 단점들을 java가 해결해줌!**
    - **아래와 같이 `enum`을 사용해서 정말 간단하게 만들 수 있음.**
    
    ```java
    package enumeration.ex3;
    
    public enum Grade {
        BASIC, GOLD, DIAMOND
        // 열거형을 정의할 때는 class 대신에 enum을 사용함.
        // 원하는 상수의 이름을 나열하면 됨.
        // enum 열거형도 클래스임.
        // 열거형은 자동으로 java.lang.Enum을 상속 받음.
        // -> 다른 클래스 상속 불가능 -> 인터페이스를 사용해야 함.
    }
    ```
    
    ---
    
- **위와 같이 자바는 타입 안전 열거형 패턴을 매우 편리하게 사용할 수 있는 열거형(Enum Type)을 제공함.**
- **`enum`은 enumeration의 줄임말이며, 번역하면 열거라는 뜻이 되고, 어떤 항목을 나열하는 것을 의미함.**
- **Enumeration은 일련의 명명된 상수들의 집합을 정의하는 것을 의미하며, 프로그래밍에서는 이러한 상수들을 사용하여 코드 내에서 미리 정의된 값들의 집합을 나타냄.**
- **쉽게 이야기해서 회원의 등급은 상수로 정의한 BASIC, GOLD, DIAMOND만 사용할 수 있다는 뜻임.**
- **자바의 `enum`은 타입 안전성을 제공하고, 코드의 가독성을 높이며, 예상 가능한 값들의 집합을 표현하는 데 사용됨.**
    
    ---
    
    ```java
    package enumeration.ex3;
    
    public class EnumRefMain {
    
        public static void main(String[] args) {
            System.out.println("class BASIC = " + Grade.BASIC.getClass());
            System.out.println("class GOLD = " + Grade.GOLD.getClass());
            System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
    
            /*class BASIC = class enumeration.ex3.Grade
            class GOLD = class enumeration.ex3.Grade
            class DIAMOND = class enumeration.ex3.Grade*/
            
            System.out.println("ref BASIC = " + refValue(Grade.BASIC));
            System.out.println("ref GOLD = " + refValue(Grade.GOLD));
            System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
            
            /*ref BASIC = 4e50df2e
            ref GOLD = 1d81eb93
            ref DIAMOND = 7291c18f*/
        }
    
        // 다형성 활용
        private static String refValue(Object grade) {
            // System.identityHashCode(): 자바가 관리하는 객체의 참조값을 주소로 줌.
            // Integer.toHexString(): 숫자를 16진수로 바꿔줌. (일반적으로 확인하는 참조값: 16진수)
            return Integer.toHexString(System.identityHashCode(grade));
        }
    }
    ```
    
    ---
    
    - **위의 실행 결과를 보면 상수들이 열거형으로 선언한 타입인 Grade 타입을 사용하는 것을 볼 수 있음.**
    - **그리고 각각의 인스턴스도 서로 다른 것을 확인할 수 있음.**
    - **참고로 열거형은 `toString()`을 오버라이딩 하기 때문에 참조값을 확인할 수 없어서 참조값을 확인하기 위해 `refVale()`를 생성했음.**
    - **열거형도 클래스임. 열거형을 제공하기 위해 제약이 추가된 클래스라 생각하면 편함.**
    - **또한 Enum 열거형은 `if`를 `switch`로 변경해서 사용이 가능함.**
        
        ---
        
    
    ```java
    package enumeration.ex3;
    
    public class DiscountService {
    
        public int discount(Grade grade, int price) {
            int discountPercent = 0;
    
            // enum은 if를 switch로 변경이 가능함.
            if (grade == Grade.BASIC) {
                discountPercent = 10;
            }
    
            else if (grade == Grade.GOLD) {
                discountPercent = 20;
            }
    
            else if (grade == Grade.DIAMOND) {
                discountPercent = 30;
            }
    
            else {
                System.out.println("할인X");
            }
    
            return price * discountPercent / 100;
        }
    }
    ```
    
    ```java
    package enumeration.ex3;
    
    public class EnumEx3_1 {
    
        public static void main(String[] args) {
            int price = 10_000;
    
            DiscountService discountService = new DiscountService();
            int basic = discountService.discount(Grade.BASIC, price);
            int gold = discountService.discount(Grade.GOLD, price);
            int diamond = discountService.discount(Grade.DIAMOND, price);
    
            System.out.println("basic = " + basic);
            System.out.println("gold = " + gold);
            System.out.println("diamond = " + diamond);
        }
    }
    ```
    
    ---
    
    ```java
    package enumeration.ex3;
    
    public class EnumEx3_2 {
    
        public static void main(String[] args) {
            int price = 10_000;
    
            DiscountService discountService = new DiscountService();
    
            // Grade myGrade = new Grade(); // enum은 객체 생성이 불가능함.
            // enum은 열거형 내부에서 상수로 지정하는 것 이외에 직접 생성이 불가능함.
            // 생성할 경우에는 컴파일 오류가 발생함.
        }
    }
    ```
    
    ---
    
    - **열거형의 장점**
        1. **타입 안정성 향상: 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력될 가능 성이 없음. (만약 유효하지 않은 값을 입력할 경우 컴파일 오류가 발생함)**
        2. **간결성 및 일관성: 열거형을 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장됨.**
        3. **확장성: 새로운 회원 등급 타입을 추가하고 싶을 떄, `enum`에 새로운 상수를 추가하기만 하면 됨.**
        
        ---
        
    
    ```java
    package enumeration.ex3;
    
    import java.util.Arrays;
    
    public class EnumMethodMain {
    
        public static void main(String[] args) {
    
            Grade[] values = Grade.values(); // BASIC, GOLD, DIAMOND
            System.out.println("values = " + Arrays.toString(values));
    
            for (Grade value : values) {
                System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
            }
    
            // String -> enum 변환
            String input = "GOLD";
            Grade gold = Grade.valueOf(input);
            System.out.println("gold = " + gold); // toString() 오버라이딩이 가능함.
    
            /*
                1. Arrays.toString(): 배열의 참조값이 아닌 배열 내부의 값을 출력할 때 사용함.
                2. values(): 모든 ENUM 상수를 포함하는 배열을 반환함.
                3. name(): ENUM 상수의 이름을 문자열로 반환함.
                4. ordinal(): ENUM 상수의 선언 순서(0부터 시작)를 반환함.
                5. toString(): ENUM 상수의 이름을 문자열로 반환함.
                    - name() 메서드와 유사하지만, toString()은 직접 오버라이딩이 가능함.
    
                주의! - ordinal()은 가급적 사용하지 않는 것이 좋음.
            */
        }
    }
    
    // 모든 열거형은 java.lang.Enum 클래스를 자동으로 상속 받음.
    // 따라서 해당 클래스가 제공하는 기능을 사용할 수 있음.
    ```
    
    ---
    
# 열거형 정리!

1. **열거형은 java.lang.Enum을 자동(강제)으로 상속 받음.**
2. **열거형은 이미 java.lang.Enum을 상속 받았기 때문에 추가로 다른 클래스를 상속 받을 수 없음.**
3. **열거형은 인터페이스를 구현할 수 있음.**
4. **열거형에 추상 메서드를 선언하고 구현할 수 있음.**
    1. **이 경우 익명 클래스와 같은 방식을 사용함.**
