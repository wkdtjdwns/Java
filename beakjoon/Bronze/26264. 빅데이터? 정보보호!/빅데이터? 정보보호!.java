import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int security = (str.length() - str.replace("security", "").length()) / 8;
        int bigdata = (str.length() - str.replace("bigdata", "").length()) / 7;
        if (security > bigdata) {
            System.out.println("security!");
        }

        else if (security < bigdata) {
            System.out.println("bigdata?");
        }

        else {
            System.out.println("bigdata? security!");
        }
    }
}
