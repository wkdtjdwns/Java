package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산");
        // 결국 새로운 인스턴스를 생성하는 것 말고는 값을 변경할 수 없음.
        // -> 값이 공유된 상태로 변경되는 일이 없어짐.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
