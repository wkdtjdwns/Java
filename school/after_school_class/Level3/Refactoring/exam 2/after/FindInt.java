package removecontrolflag.before;

public class FindInt {

    public static boolean find(int[] data, int number) {

        // 깃발이라는 뜻인데, 뭘 의미하는 지 알 수 없음.
        boolean flag = false;

        for (int i = 0; i < data.length; i++) {

            // 숫자를 찾아도 끝내지 않고 반복을 계속함.
            if (data[i] == number) {
                flag = true;
            }
        }

        return flag;
    }
}
