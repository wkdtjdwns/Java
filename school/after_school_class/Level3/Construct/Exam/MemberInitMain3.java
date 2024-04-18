package construct;

public class MemberInitMain3 {

    public static void main(String[] args) {

        // 메서드를 이용한 초기화 1
        MemberInit member1 = new MemberInit();
        member1.inItMember("user1", 15, 90);

        // 메서드를 이용한 초기화 2
        MemberInit member2 = new MemberInit();
        member2.inItMember("user2", 16, 80);

        // -> 이렇게 되면 Main에서 사용하는 코드도 줄어들고
        // -> 다른 클래스에서도 쉽게 사용할 수 있는 생성자가 됨.

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }
    }
}
