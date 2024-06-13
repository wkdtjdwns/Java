package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("부산 -> b");

        // 참조형 데이터 타입이기 때문에 주소 값을 참조함.
        // -> 값이 바뀌더라도 주소 값은 똑같음.
        // -> 같은 주소를 가지고 있기 때문에 같은 값이 나오게 됨.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // 이런 식으로 한층 더 복잡한 내용의 코드일 때에는 사이드 이펙트를 찾는 것이 훨씬 어려움.
    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
