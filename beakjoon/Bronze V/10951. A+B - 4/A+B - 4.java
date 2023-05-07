import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		while( (str=br.readLine()) != null ) // 입력이 없지 않을 때까지 반복
		{ 
			// charAt() 은 해당 문자의 아스키코드 값을 반환하기 때문에 정수 형태로 변경하려면 반드시 -48 또는 -'0'을 해주어야 함
			int a = str.charAt(0) - 48; 
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
		}
		System.out.print(sb);
	}
}
