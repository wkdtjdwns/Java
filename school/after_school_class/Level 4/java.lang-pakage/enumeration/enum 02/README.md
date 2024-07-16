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
