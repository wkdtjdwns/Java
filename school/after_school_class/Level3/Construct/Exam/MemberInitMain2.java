package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {

        // 메서드를 이용한 초기화 1
        MemberInit member1 = new MemberInit();
        inItMember(member1, "user1", 15, 90);

        // 메서드를 이용한 초기화 2
        MemberInit member2 = new MemberInit();
        inItMember(member2, "user2", 16, 80);

        // -> 이렇게 되면 객체를 생성할 때마다 초기화 작업을 메서드에서 관리해서 코드의 반복이 줄어들게 됨.
        // -> 하지만 이런 식으로 사용하게 되면 굳이 다른 곳에 있는 속성인데
        // -> 여기서 초기화 메서드를 사용하기에는 캡슐화도 안 되는 등 문제가 생김.
        // -> 초기화할 속성이 있는 메서드에서 여기에 있는 메서드를 추가해 사용하기로 함.

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }
    }

    // 초기화를 위한 메서드
    static void inItMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
