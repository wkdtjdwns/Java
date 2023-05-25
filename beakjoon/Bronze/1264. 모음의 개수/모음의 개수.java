import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;)
		{
			int cnt = 0;
			String str = br.readLine();
			if (str.equals("#")) break;
			str = str.toLowerCase();
			for (int i=0; i<str.length(); i++)
			{
				switch (str.charAt(i))
				{
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						cnt++;
					default:
						break;
				}
			}
			System.out.println(cnt);
		}
	}
}
