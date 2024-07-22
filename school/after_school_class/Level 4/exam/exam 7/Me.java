package solveExam.exam7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Me {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = i + 1;
        }

        int[] result = new int[n];
        int index = 0;
        int currentIndex = 0;

        sb.append("<");
        for (int i = 0; i < n; i++) {
            currentIndex = (currentIndex + k - 1) % (n - i);
            result[index++] = people[currentIndex];

            for (int j = currentIndex; j < n - i - 1; j++) {
                people[j] = people[j + 1];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            sb.append(result[i]).append(", ");
        }

        sb.append(result[n - 1]).append(">");
        System.out.println(sb);
    }
}
