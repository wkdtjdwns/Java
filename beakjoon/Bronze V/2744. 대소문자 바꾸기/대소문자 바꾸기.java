import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for (int i=0; i<str.length(); i++) 
		{
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) // 문자열 str의 i번째 문자가 대문자면
			{
				// 줄바꿈 없이 그 문자의 소문자 출력
				System.out.print(String.valueOf(c).toLowerCase());
			} else // 문자열 str의 i번째 문자가 대문자가 아니면 -> 소문자면
			{
				// 줄바꿈 없이 그 문자의 대문자 출력
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}
}
