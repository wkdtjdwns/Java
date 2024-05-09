package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스를 참조함 (부모 인스턴스 사용)
        System.out.println("Parent -> Parent");
        Parent parent = new Parent(); // 부모 객체가 힙 영역에 생성됨.
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스를 참조함. (자식 인스턴스 사용)
        System.out.println("Child -> Child");
        Child child = new Child(); // 부모와 자식 객체가 순서대로(super() 때문) 힙 영역에 생성됨.
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스를 참조함. (다형적 참조) -> 부모는 자식을 품을 수 있다!
        System.out.println("Parent -> Child");

        // Parent 타입이 Child() 생성자를 사용함.
        Parent poly = new Child(); // 부모와 자식 객체가 순서대로(super() 때문) 힙 영역에 생성됨.
        // 하지만 Parent를 참조하고 있기 때문에 자식의 기능은 사용 불가능함.

        poly.parentMethod();
        // poly.childMethod(); // 자식의 기능은 호출할 수 없음.

        // Child child1 = new Parent(); // 자식은 부모를 담을 수 없음.
    }
}
