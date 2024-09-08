import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[8][2];
        int[] results = new int[5];
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) {
                    return 1;
                }

                else if (o1[0] == o2[0]) {
                    return 0;
                }

                else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < 5; i++) {
            result += arr[i][0];
            results[i] = arr[i][1] + 1;
        }

        Arrays.sort(results);

        System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.print(results[i] + " ");
        }
    }
}
