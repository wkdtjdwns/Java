package chap_01;

public class _07_TypeCasting {
	public static void main(String[] args) {
		
		// 형변환 (Casting)
		// 정수형을 실수형으로
		// 실수형을 정수형으로
		
		// int ot float, double
		int score = 93;
		System.out.println(score); // 93
		// int형인 score를 float형으로 바꾸기
		System.out.println((float)score); // 93.0
		// int형인 score를 double형으로 바꾸기
		System.out.println((double)score); // 93.0
		
		// float, double to int
		float score_f = 93.3F;
		double score_d = 98.8;
		System.out.println((int)score_f); // 93
		System.out.println((int)score_d); // 98
		
		// 정수 + 실수 연산
//		score = 93 + 98.8; int형과 double형의 덧셈이라서 덧셈까지는 가능하지만
//		score 변수에 넣을 수 없음(더하고 나서 int형에 담을 수 없음)
		
		// 해결방법
		score = 93 + (int)98.8; // 93 + 98(int형이라서 소수점 부분이 사라짐) = 191
		System.out.println(score);
		
		score_d = (double)93 + 98.8; // (double)을 생략 할 수 있다.
		
		// 변수에 형변환된 데이터 집어넣기
		double convertedScoreDouble = score; // 191 => 191.0
		// int => long => float => double (자동 형변환)
		
		int convertedScoreInt = (int)score_d; // 191.8 => 191
		// double => float => long => int (수동 형변환)
	}
}
