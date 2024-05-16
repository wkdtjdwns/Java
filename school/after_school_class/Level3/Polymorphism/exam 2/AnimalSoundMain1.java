package poly.ex2;

public class AnimalSoundMain1 {

    // 다형적 참조를 사용해 메서드 하나로 출력하기
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    /*
    // Dog는 받지만... Cat이랑 cow는 어케 받음?
    // 물론 메서드를 3개를 만들 수도 있겠지만... 그럴꺼면 굳이 메서드를 만들 이유가 없어짐.
    // -> 다형적 참조 사용!
    public static void soundAnimal(Dog dog) {

    }
    */

    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 동물들의 클래스에서 모두 오버라이딩 했기 때문에 동물 울음 소리가 아닌 각 동물의 울음소리가 출력됨.
        System.out.println("동물 소리 테스트 종료");
    }
}

/*
위 코드의 핵심은 Animal animal 부분임.
    - 다형적 참조 덕분에 animal 변수는 자식인 dog, cat, cow의 인스턴스를 참조할 수 있음.
    - 메서드 오버라이딩 덕분에 animal.sound()를 호출해도 Dog.sound(), Cat.sound(), cow.sound()와 같이 각 인스턴스의 메서드를 호출할 수 있음.
    -
 */
