package poly.ex2;

public class AnimalSoundMain3 {

    public static void main(String[] args) {

        // 배열을 만드는 것과 동시에 인스턴스를 만들어서 해당 주소 값을 저장함.
        // 실제로도 많이 사용하는 방법임.
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    public static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 동물들의 클래스에서 모두 오버라이딩 했기 때문에 동물 울음 소리가 아닌 각 동물의 울음소리가 출력됨.
        System.out.println("동물 소리 테스트 종료");
    }
}

/*
하지만 이렇게 하면 2가지의 문제가 생길 수 있음.
1. 사용자가 메서드의 오버라이딩을 깜빡했을 때 오류가 발생할 수 있음. (컴파일 오류)
2. Animal 클래스는 동물들을 만들기 위한 클래스이지만,
    Animal animal = new Animal()와 같이 생성할 수 있음. (쓸모 없는 행동)
 */
