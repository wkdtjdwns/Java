package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {

        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        /*
            lang.object.tostring.Car@1b6d3586
            Dog{dogName='멍멍이1', age=2}
            Dog{dogName='멍멍이2', age=5}
         */

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        /*
            lang.object.tostring.Car@1b6d3586
            Dog{dogName='멍멍이1', age=2}
            Dog{dogName='멍멍이2', age=5}
         */

        // 결국 둘 다 똑같기 때문에 굳이 toString()을 사용할 필요가 없음.

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        /*
            객체 정보 출력: lang.object.tostring.Car@1b6d3586
            객체 정보 출력: Dog{dogName='멍멍이1', age=2}
            객체 정보 출력: Dog{dogName='멍멍이2', age=5}
         */
        
        // 위와 같이 다형성을 사용해서 필요한 정보를 추가로 담아서 사용할 수도 있음.
    }
}
