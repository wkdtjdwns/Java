package poly.ex4;

// 인터페이스는 확장의 의미인 extands가 아닌 구현의 의미인 implements 키워드를 사용함.
public class Dog implements InterfaceAnimal {

    @Override
    public void move() {
        System.out.println("멍멍");
    }

    @Override
    public void sound() {
        System.out.println("개 이동");
    }
}
