import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(br.readLine());
        System.out.println( (b / 11) * 10 );
    }
}
