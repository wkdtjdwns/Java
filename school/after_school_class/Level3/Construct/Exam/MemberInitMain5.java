package construct;

public class MemberInitMain5 {

    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);

        // 메소드 오버로딩을 사용해서 값이 몇개 없는 생성자를 사용할 수 있음
        // -> 값을 나중에도 줄 수 있음.
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        // 이렇게 되면 값을 나중에도 초기화가 가능해짐.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }
    }
}
