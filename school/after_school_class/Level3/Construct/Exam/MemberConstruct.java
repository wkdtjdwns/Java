package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 기본 생성자
    // "개발자가 생성자를 만들지 않았을 경우"에는 자바가 직접 만들어줌
    // -> 생성자를 1개라도 직접 만들었을 경우에는 자바가 기본 생성자를 자동으로 생성해주지 않음.
    // -> 기본 생성자가 필요하면 직접 만들어야 함.
    MemberConstruct() {}

    // 생성자
    // 접근 제어자를 쓰지 않으면 클래스의 접근 제어자를 따라감 (지금은 public임)
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 메소드 오버로딩! (파라미터의 개수가 다름)
    MemberConstruct(String name, int age) {
        // 하지만 이렇게 되면 반복되는 코드가 생김...

        // this.name = name;
        // this.age = age;

        // 이렇게 되면 초기 값을 임의로 초기화 해줄 수 있을 뿐만 아니라
        // 자기 자신을 불러오는 것이기 때문에 코드도 간결해짐.
        this(name, age, 50);
    }
}
