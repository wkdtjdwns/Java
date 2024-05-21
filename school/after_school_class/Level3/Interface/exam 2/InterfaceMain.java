package poly.ex4;

public class InterfaceMain {

    public static void main(String[] args) {

        // 인터페이스를 인스턴스화 시킬 수 없음.
        // InterfaceAnimal animal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 인터페이스 또한 다형성을 사용할 수 있음
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

// 현재 사용법만 보면 앞서 설명한 순수 추상 클래스 예제와 거의 유사함.
// 순수 추상 클래스가 인터페이스로 바뀌었을 뿐임.
