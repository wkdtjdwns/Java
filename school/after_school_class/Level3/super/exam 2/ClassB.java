package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {

        // 아래에 있는 생성자를 호출하기 때문에 굳이 super()를 사용하지 않아야 됨.
        // -> super()는 한 번만 사용함.
        this(a, 0);
    }

    public ClassB(int a, int b) {
        super(); // 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
