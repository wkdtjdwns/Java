package pack;

import pack.a.User;

public class PackageMain1 {

    public static void main(String[] args) {

        Data data = new Data(); // 같은 패키지 내에 있기 때문에 그냥 인스턴스화가 가능함.

        // 패키지가 다르기 때문에 import 해주거나 경로를 적어줘야 함.
        // pack.a.User user = new pack.a.User();
        User user = new User();
    }
}
