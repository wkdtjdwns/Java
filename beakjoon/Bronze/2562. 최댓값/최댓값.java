import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }

        int maxValue = -1;
        for (int num : nums) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        System.out.println(maxValue);
        System.out.println(nums.indexOf(maxValue) + 1);
    }
}
