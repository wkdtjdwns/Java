package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND
    // 열거형을 정의할 때는 class 대신에 enum을 사용함.
    // 원하는 상수의 이름을 나열하면 됨.
    // enum 열거형도 클래스임.
    // 열거형은 자동으로 java.lang.Enum을 상속 받음.
    // -> 다른 클래스 상속 불가능 -> 인터페이스를 사용해야 함.
}
