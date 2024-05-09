package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    // 다운캐스팅이 가능한지 확인하는 메소드
    // 개발자의 필요에 의해서 만들어짐.
    // -> 사용자가 사용하는 것이 아님 -> private
    private static void call(Parent parent) {
        parent.parentMethod();

        // A instanceof B = A가 B를 참조하고 있는 지 여부
        // parent 변수가 Child를 참조하고 있는지 확인
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            ((Child)parent).childMethod();
        }
    }
}

/*
지금처럼 다운캐스팅을 수행하기 전에 먼저 instanceof를 사용해서
원하는 타입으로 변경이 가능한지 확인한 다음에 다운캐스팅을 수행하는 것이 안전함.

참고로 instanceof를 키워드는 오른쪽 대상의 자식 타입을 왼쪽에 참조하는 경우에도 true를 반환함.

new Parent() instanceof Parent : true
new Child() instanceof Parent : true

new Parent() instanceof Parent
Parent p = new Parent() : true

new Child() instanceof Parent
Parent p = new Child() : true

new Parent() instanceof Child
Child c = new Parent() : false
 */
