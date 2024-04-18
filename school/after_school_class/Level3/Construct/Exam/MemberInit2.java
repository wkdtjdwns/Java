package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 초기화를 위한 메서드
    // 인스턴스화 하면 이 함수를 사용할 수 있음 -> static이 필요 없음
    void inItMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
