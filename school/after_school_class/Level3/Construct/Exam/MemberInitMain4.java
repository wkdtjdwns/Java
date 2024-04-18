package construct;

public class MemberInitMain4 {

    public static void main(String[] args) {

        // MemberConstruct member1 = new MemberConstruct(null, 0, 0); 자동 완성
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        // 이렇게 되면 초기화 코드가 줄어드는 것은 물론
        // 무조건 파라미터를 모두 줘야만 실행되기 때문에 실수로 값을 넣지 않는 경우가 줄어들게 됨.

        // new : 생성자를 사용하겠다는 뜻!

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }
    }
}
