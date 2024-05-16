package poly.ex3;

// 추상 클래스
public abstract class Animal {

    // 추상 메서드 (해당 클래스는 무조건 추상 클래스임.)
    public abstract void sound();

    // 일반 메서드
    public void move() {
        System.out.println("동물이 움직인다.");
    }
}
