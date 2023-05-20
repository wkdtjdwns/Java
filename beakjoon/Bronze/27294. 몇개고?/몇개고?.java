import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		if (S == 1 || !(T >= 12 && T <= 16)) System.out.println(280);
		else if (T >= 12 && T <= 16 && S == 0) System.out.println(320);
	}
}
