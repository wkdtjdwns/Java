import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("int a;");
        System.out.println("int *ptr = &a;");
        for (int i = 2; i <= n; i++) {
            System.out.print("int ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("ptr" + i + " = &ptr" + (i - 1 == 1 ? "" : i - 1) + ";");
        }
    }
}
