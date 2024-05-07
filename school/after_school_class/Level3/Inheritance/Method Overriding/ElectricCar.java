package extends1.overriding;

public class ElectricCar extends Car {

    // 메소드 오버라이딩: 상속을 받은 메소드를 자식 클래스에서 다시 한번 재정의하는 것임.
    // 나만의 특색을 추가해서 다시 정의하는 것임.

    @Override // 오버라이딩 했다는 사실을 알려줌. -> 부모 클래스의 해당 메소드의 이름을 가진 메소드가 있는지 확인해줌.
    public void move() {
        System.out.println("전기차를 빠르고 조용하게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
