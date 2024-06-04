package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        // Object 인스턴스도 만들 수 있음.
        // -> 추상 클래스는 아님
        Object object = new Object();

        Object[] objects = { dog, car, object };
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수: " + objects.length);
    }
}
