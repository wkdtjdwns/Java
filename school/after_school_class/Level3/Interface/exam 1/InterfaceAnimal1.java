package poly.interface1;

// 인터페이스
// 인터페이스는 class 대신 interface 키워드를 사용하면 됨.
// 인터페이스의 메서드는 public abstract를 무조건 사용함.
// 그래서 생략이 가능함.
public interface InterfaceAnimal1 {

    void sound();
    void move();

    public static final double MY_PI = 3.14;
    double YOU_PI = 3.14;
}

// 인터페이스에서 멤버 변수들은 public static final이 모두 포함되었다고 간주함.
// final은 변수의 값을 한 번 설정하면 수정할 수 없다는 뜻임. (상수)
// 자바에서 static final을 사용해 정적이면서 고칠 수 없는 변수를 상수라고 하고, 관례상 상수는 모두 대문자에 언더스코어(_)로 구분함.
// 또한 해당 키워드는 생략이 가능함. (생략 권장)
