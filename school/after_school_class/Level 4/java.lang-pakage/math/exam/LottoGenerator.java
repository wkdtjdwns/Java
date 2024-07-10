package lang.math.test;

import java.util.ArrayList;
import java.util.Random;

public class LottoGenerator {

    ArrayList<Integer> lottoNumbers = new ArrayList<>();

    public int[] generate() {

        Random random = new Random();

        int index = 0;
        while (index < 6){
            int ranvalue = random.nextInt(45) + 1;

            if (!lottoNumbers.contains(ranvalue)) {
                lottoNumbers.add(ranvalue);
                index++;
            }
        }

        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = lottoNumbers.get(i);
        }

        return lotto;
    }
}
