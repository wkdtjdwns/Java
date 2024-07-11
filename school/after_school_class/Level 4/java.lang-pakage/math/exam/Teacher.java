package lang.math.test.teacher;

import java.util.Random;

public class LottoGenerator {

    // 혹시라도 다시 생성되는 일을 막음.
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate() {
        lottoNumbers = new int[6];
        cnt = 0;
        while (cnt < 6) {
            int number = random.nextInt(45) + 1;

            if (isUnique(number)) {
                lottoNumbers[cnt] = number;
                cnt++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int num) {
        for (int i=0; i<cnt; i++) {
            if (lottoNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
