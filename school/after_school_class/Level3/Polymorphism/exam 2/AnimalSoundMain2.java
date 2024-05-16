package poly.ex2;

public class AnimalSoundMain2 {

    // 반복문을 활용해 출력하기
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        
        Animal[] animals = { dog, cat, cow };
        
        // 짜피 모두 다 Animal이라는 부모를 가지고 있기 때문에 foreach문을 활용할 수 있음.
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
