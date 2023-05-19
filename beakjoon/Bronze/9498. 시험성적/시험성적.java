import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		String str = (test >= 90) ? "A" : (test >= 80) ? "B" : (test >= 70) ? "C" : (test >= 60) ? "D" : "F";
		System.out.println(str);
	}
}
