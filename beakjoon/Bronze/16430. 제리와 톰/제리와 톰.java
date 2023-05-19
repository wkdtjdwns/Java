import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int jerry1 = Integer.parseInt(st.nextToken());
		int jerry2 = Integer.parseInt(st.nextToken());
		System.out.println((jerry2 - jerry1) + " " + jerry2);
	}
}
