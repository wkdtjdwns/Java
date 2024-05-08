package extends1.super2;

public class ClassC extends ClassB {

    // ClassB에 기본 생성자가 없기 때문에 무조건 super()를 사용해서 호출해줘야 함.
    public ClassC() {
        super(10, 20); // 생략 불가능
        System.out.println("ClassC 생성자");
    }
}
