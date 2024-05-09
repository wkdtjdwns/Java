package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {

        // 다형적 참조
        Parent poly = new Child();
        // poly.childMethod();

        // 다운 캐스팅 (부모타입 -> 자식타입)
        Child child = (Child) poly; // Parent형이였던 poly를 Child형으로 변환함.

        child.childMethod();
        child.parentMethod(); // 상속받기 때문에 Parent의 기능 또한 사용 가능
    }
}
