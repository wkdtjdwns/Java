package S21221_00;

public class TestFormat01 {

	public static void main(String[] args) {
		System.out.printf("이름 : %s", "우리들 ");
		System.out.printf("학번 : %d\n", 21200);

		System.out.printf("이름 : %s", "우리들, ");
		System.out.printf("학번 : %d, ", 21200);
		System.out.printf("전화번호 : %s\n", "010-1234-5678");
		
		System.out.printf("이름 : %s", "우리들, ");
		System.out.printf("전화번호 : %s", "010-1234-5678, ");
		System.out.printf("학번 : %d\n", 21200);
	}
}

/*
실행 결과
----------------------------------------------------
이름 : 우리들 학번 : 21200
이름 : 우리들, 학번 : 21200, 전화번호 : 010-1234-5678
이름 : 우리들, 전화번호 : 010-1234-5678, 학번 : 21200
*/
