package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {

        // 추상 클래스 생성
        // Animal animal = new Animal(); // 생성이 불가능함.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 추상 메서드와 기본 메서드 둘 다 사용 가능함.
        cat.sound();
        cat.move();
    }
}
