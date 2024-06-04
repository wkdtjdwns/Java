public class ObjectPolyExample1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        // 다형성 사용
        action(car);
        action(dog);
    }

    // 모든 클래스의 최상위 부모 클래스인 Object!
    private static void action(Object obj) {
        // 부모는 자식의 메서드를 참조할 수 없음.
        // car.move(); // 컴파일 오류, Object에는 move()가 없음.
        // dog.sound(); // 컴파일 오류, Object에는 sound()가 없음.

        // -> 다운캐스팅해서 접근해야 함.

        if (obj instanceof Dog dog) {
            dog.sound();
        }

        else if (obj instanceof Car car) {
            car.move();
        }
    }
}
