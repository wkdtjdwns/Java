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
    
    ---
    
    - **아래와 같이 `enum`을 사용해서 정말 간단하게 만들 수 있음.**
    
    ```java
    package enumeration.ex3;
    
    public enum Grade {
        BASIC, GOLD, DIAMOND
    }
    ```