package extends1.ex2;

// Car 클래스를 상속받음
public class ElectricCar extends Car {

    /*
     전기차 ElectricCar는 extends Car를 사용해서 부모 클래스인 Car를 상속 받음.
     상속을 받은 덕분에 ElectricCar에서도 move()를 사용할 수 있음.
     */

    public void charge() {
        System.out.println("충전합니다.");
    }
}
