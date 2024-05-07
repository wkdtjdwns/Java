package extends1.access.child;

// 상속 받기 위한 import
import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        // defaultValue = 1; // 패키지가 달라서 실행 불가능
        // privateValue = 1; // private는 접근이 불간으함.

        printParent();
    }
}
