import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        if (str.toLowerCase().equals("n")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}
