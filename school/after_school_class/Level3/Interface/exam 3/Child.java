package poly.ex5;

// 다중 구현 (다중 상속)은 컴파( , )로 구분함.
public class Child implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        // 상속 받는 두 개의 인터페이스의 메서드가 똑같다고 해도
        // 어짜피 사용할 때 재정의를 해주어야 하기 때문에
        // 무엇을 실행할지 고민할 필요가 없음.
        System.out.println("Child.methodCommon");
    }
}
