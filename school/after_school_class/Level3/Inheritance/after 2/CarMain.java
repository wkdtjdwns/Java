package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {

        // 부모 클래스의 코드만 수정하면 자식 클래스는 그대로 사용이 가능함.

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();
    }
}
