package poly.ex3;

// 추상 클래스를 상속 받는 순간 추상 메서드를 오버라이딩하기 전까지는 오류가 생김.
public class Dog extends Animal {

    @Override
    public void sound() {
        // super.sound()도 못함. (바디가 없으니 실행도 못함.)
        System.out.println("멍멍");
    }
}
