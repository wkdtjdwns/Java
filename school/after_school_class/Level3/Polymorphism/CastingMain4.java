package poly.basic;

public class CastingMain4 {

    // 다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있음
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        // Parent parent2 = new Parent(); // Parent만 생성했기 때문에 Child는 생성되지 않음
        // Child child2 = (Child) parent2; // 생성되지 않은 Child를 참조하려하니 오류가 생김
        // child2.childMethod();
    }
}
