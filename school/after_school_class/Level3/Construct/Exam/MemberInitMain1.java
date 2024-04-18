package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {

        // 객체 생성
        MemberInit member1 = new MemberInit();

        // 초기화
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        // 객체 생성
        MemberInit member2 = new MemberInit();

        // 초기화
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        // -> 이렇게 되면 객체를 생성할 때마다 초기화 작업이 굉장히 많아짐
        // -> 반복되는 코드는 함수를 만들어서 관리함!

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade );
        }
    }
}
