import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            results.add(i);
        }

        for (int i = 0; i < 100000; i++) {
            results.remove(Integer.valueOf(selfNumber(i)));
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    static int selfNumber(int i) {
        i += 1;
        String str = String.valueOf(i);

        int n = i;
        for (int j = 0; j < str.length(); j++) {
            n += Integer.parseInt(String.valueOf(str.charAt(j)));
        }

        return n;
    }
}
