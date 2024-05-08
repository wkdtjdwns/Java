package extends1.super1;

public class Child extends Parent {

    // 부모와 똑같은 이름의 변수인 value
    public String value = "child";

    // 상속받은 메서드 오버라이딩
    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {

        // 자식과 부모의 필드가 모두 value여서 구분이 필요함.
        System.out.println("자식의 값: " + this.value); // this는 생략 가능
        System.out.println("부모의 값: " + super.value);

        // 오버라이딩한 메소드 호출
        this.hello(); // this는 생략 가능

        // 부모의 메소드 호출
        super.hello();
    }
}
