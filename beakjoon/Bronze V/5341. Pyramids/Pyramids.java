import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) 
		{
			int blocks = 0;
			int n = Integer.parseInt(br.readLine());
			for (int i=1; i<=n; i++) 
			{
				blocks += i;
			}
			if (n == 0) break;
			System.out.println(blocks);
		}
	}
}
