package pack;

import pack.a.User;

public class PackageMain2 {

    public static void main(String[] args) {

        // 실제 회사에서 사용하는 패키지 사용법
        // 클래스를 만들 때마다 클래스 이름을 상의할 수가 없음...
        // 그래서 클래스를 만들 때는 맘대로 만들되, 패키지 이름을 다르게 함.
        Data data = new Data();

        // 각 패키지에 같은 클래스 이름이 있을 때에는
        // 많이 사용하는 User를 import해서 받아오고
        // 비교적 덜 사용하는 User는 경로를 지정해서 사용함.

        // 둘다 import 해서 사용하는 것은 불가능함.
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
