package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {

        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);

        // +를 써도 자바가 알아서 concat()으로 바꿔줌.
        // -> 결과가 같음.
        // -> 실행 시간이 느려지기야 하겠지만 의미가 크지 않음.
        // -> 대신 사용자가 월등하게 편해짐.
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
