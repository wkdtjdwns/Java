import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long cnt = 1L;
		for (int i=1; i<=N; i++) cnt *=i;
		System.out.println(cnt);
	}
}
