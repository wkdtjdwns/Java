package generics.coffee;

import generics.user.User;
import generics.user.VIPUser;

public class CoffeeMain {

    public static void main(String[] args) {

        // 그냥 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(10);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("--------------------");

        // Object 사용
        CoffeeByObject c3 = new CoffeeByObject(11);
        c3.ready();

        CoffeeByObject c4 = new CoffeeByObject("박명수");
        c4.ready();

        System.out.println("--------------------");

        // Object 사용의 단점
        int c3Name = (int)c3.name; // c3.name: Object 타입 -> 캐스팅 필요
        System.out.println("주문 고객 번호: " + c3Name);

        String c4Name = (String) c4.name; // c4.name: Object 타입 -> 캐스팅 필요
        System.out.println("주문 고객 이름: " + c4Name);

        // Object형이 아니면 형변환이 원래 불가능함. (int -> String)
        // 하지만 Object형이기 때문에 컴파일에는 문제가 없고 런타임에서만 문제가 생김.
        // c4Name = (String)c3.name;

        System.out.println("--------------------");

        // Generic Class 사용
        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();

        // c5.name은 선언할 때부터 Integer였기 때문에 굳이 형변환을 해줄 필요 없음. (오토 언박싱)
        int c5Name = c5.name;
        System.out.println("주문 고객 번호: " + c5Name);

        Coffee<String> c6 = new Coffee<>("하하");
        c6.ready();

        // 마찬가지로 선언할 때부터 String였기 때문에 굳이 형변환을 해줄 필요 없음. (오토 언박싱)
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: " + c6Name);

        System.out.println("----------------------------------------");

        // CoffeeByUser는 <T extands User>로 User와 관련된 클래스로만 한정되어 있기 떄문에
        // User와 관련되어 있지 않으면 사용이 불가능함.
        // CoffeeByUser<String> c7 = new CoffeeByUser<>("노홍철");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("노홍철"));
        c7.ready();

        CoffeeByUser<VIPUser> c8 = new CoffeeByUser<>(new VIPUser("정형돈"));
        c8.ready();

        System.out.println("----------------------------------------");

        orderCoffee("홍길동");
        orderCoffee("장발장", "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료: " + name);
    }

    // 2개 이상의 매개변수들은 ","로 구분해줌. (매개변수 취급이기 때문에 오버로딩도 가능)
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료: " + name);
    }
}
