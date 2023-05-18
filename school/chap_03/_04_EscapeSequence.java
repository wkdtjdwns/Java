package chap_03;

public class _04_EscapeSequence {
	public static void main(String[] args) {
		System.out.println("자바가");
		System.out.println("너무");
		System.out.println("좋아요!");
		
		System.out.println("==========================");
		
		// 줄바꿈 => \n
		System.out.println("자바가\n너무\n좋아요!");
		
		System.out.println("==========================");
		
		// 탭 효과 => \t
		System.out.println("자바\t\t홍길동");
		System.out.println("파이썬\t\t장발장");
		System.out.println("C#\t\t로미오");
		
		// C:\workspace_java_basic 출력 => \ 를 문자열로 출력하고 싶을 때에는 \\ 로 사용한다
		System.out.println("C:\\workspace_java_basic");
		
		// 우리집 고양이가 "냐옹~" 하고 운다. 출력 => "(큰 따옴표) 를 문자열로 출력하고 싶을 때에는 \" 로 사용한다
		System.out.println("우리집 고양이가 \"냐옹~\" 하고 운다.");
		
		// '(작은 따옴표)는 출력이 가능은 하지만 정확하게 출력하려면 \' 로 사용한다
		System.out.println("우리집 고양이가 \'냐옹~\' 하고 운다.");
	}
}
