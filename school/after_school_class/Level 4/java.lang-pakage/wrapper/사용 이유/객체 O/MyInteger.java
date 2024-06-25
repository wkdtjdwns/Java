package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        }

        else if (value > target) {
            return 1;
        }

        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value); // 숫자를 문자로 변경
    }
}

/*
MyInteger는 int value라는 단순한 기본형 변수를 하나 가지고 있음.
이 기본형 변수를 편리하게 사용하도록 다양한 메서드를 제공함.
compareTo() 메서드를 클래스 내부로 캡슐화 함.
이 클래스는 불변 객체로 설계함.
*/
