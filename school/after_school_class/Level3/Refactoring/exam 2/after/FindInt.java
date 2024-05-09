package removecontrolflag.after;

public class FindInt {

    public static boolean find(int[] data, int number) {

        // 의미를 확실히 알 수 있는 변수명
        boolean found = false;

        for (int i = 0; i < data.length; i++) {

            if (data[i] == number) {
                found = true;
                return found;
                // break보다는 찾자마자 함수를 종료 시키는 return이 더 효율적임.
            }
        }

        return found;
    }
}
