import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) 
		{
			String str = br.readLine();
			String start = String.valueOf(str.charAt(0));
			String end = String.valueOf(str.charAt(str.length()-1));
			System.out.println(start + end);
		}
	}
}
