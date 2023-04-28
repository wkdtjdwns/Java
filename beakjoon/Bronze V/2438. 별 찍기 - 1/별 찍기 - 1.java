import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) { // 줄 바꿈 하는 반복문
			for (int j = 1; j <= i; j++) { // 별을 출력 하는 반복문
				System.out.print("*"); // 별을 붙여서 출력함
			}
			System.out.println(); // 줄바꿈
		}
	}
}
