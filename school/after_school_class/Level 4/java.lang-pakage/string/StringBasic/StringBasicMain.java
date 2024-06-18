package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

// 쌍따옴표 사용 방법, 객체 생성 방법이 있음.
// String은 클래스임. int, boolean과 같은 기본형이 아니라 참조형임.
// 따라서 str1 변수에는 String 인스턴스의 참조 값만 들어갈 수 있음.
// 그러면 String str1 = "hello"; 문장은 뭔가 어색해 보임.
// String str1 = "hello";
// String str1 = new String("hello");
