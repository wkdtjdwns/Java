package enumeration.test.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AuthGradeMain2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        AuthGrade[] values = AuthGrade.values();
        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(values) + ": " );
        String grade = br.readLine().toUpperCase();
        printInfo(AuthGrade.valueOf(grade));
    }

    private static void printInfo(AuthGrade authGrade) {
        System.out.println("==메뉴 목록==");
        System.out.println("당신의 등급은 " + authGrade.getDesc());
        switch (authGrade) {
            case GUEST:
                System.out.println("- 메인 화면");
                break;

            case LOGIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                break;


            case ADMIN:
                System.out.println("- 메인 화면");
                System.out.println("- 이메일 관리 화면");
                System.out.println("- 관리자 화면");
                break;
        }
    }
}
