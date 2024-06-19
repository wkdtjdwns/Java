package lang.string.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String find = br.readLine();

        String[] result = str.split(find);
        System.out.println(result.length - 1);
    }
}
