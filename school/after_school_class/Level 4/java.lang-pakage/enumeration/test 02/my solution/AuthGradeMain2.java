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
        AuthGrade.valueOf(grade).printInfo();
    }
}
