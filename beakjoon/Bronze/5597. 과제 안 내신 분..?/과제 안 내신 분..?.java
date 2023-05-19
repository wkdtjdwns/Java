import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 ~ 30번까지 있는 리스트 생성
		int[] std = new int[31];
		for (int i = 1; i < 29; i++) {
			int n = sc.nextInt(); // 입력한 숫자를
			std[n] = 1;			  // 1로 치환함
		}
		for (int i = 1; i < std.length; i++) {
			if (std[i] != 1) { // 리스트의 값 중에 1이 아닌 값을 출력함
				System.out.print(i + " ");
			}
		}
	}
}
