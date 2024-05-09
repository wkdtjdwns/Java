package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        // 다형적 참조
        Parent poly = new Child();
        // poly.childMethod();

        // 일시적 다운 캐스팅 (필요할 때에만 잠깐 캐스팅하는 것임.)
        ((Child)poly).childMethod(); // 변수를 생성하는 메모리의 낭비를 줄일 수 있음.
    }
}
