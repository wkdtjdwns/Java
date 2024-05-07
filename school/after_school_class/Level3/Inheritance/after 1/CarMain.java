package extends1.ex2;

public class CarMain {

    /*
    부모 클래스(슈퍼 클래스): 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스(Car.java)
    자식 클래스(서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스(ElectricCar.java, GasCar.java)

    또한 java는 다중 상속을 지원하지 않음.
    그래서 extends의 대상은 하나만 선택할 수 있음. (단일 상속)
    다중 상속할 때 상속하는 부모 클래스의 멤버들이 같거나 유사할 때의 문제점을 해결하지 못하기 때문임.

    하지만 java는 인터페이스의 다중 구현을 사용하면 다중 상속과 같은 기능을 사용할 수 있음.
     */

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
