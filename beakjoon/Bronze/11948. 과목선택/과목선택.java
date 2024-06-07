import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[4];

        for(int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int sum = arr[1] + arr[2] + arr[3];

        int e = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        sum += Math.max(e, f);

        System.out.println(sum);
    }
}
