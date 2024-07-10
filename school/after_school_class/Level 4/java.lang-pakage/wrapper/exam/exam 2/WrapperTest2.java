package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {

        String[] array = { "1.5", "2.5", "3.0" };

        // 배열에 입력된 모든 숫자의 합을 구하시오.
        // 숫자는 double 형이 입력될 수 있음.
        double sum = 0.0;
        for (String str : array) {
            sum += Double.parseDouble(str);
        }

        System.out.println(sum);
    }
}
