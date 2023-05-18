package chap_03;

public class _05_Quiz {
	public static void main(String[] args) {
		// 주민번호가 주어졌을 때 생년월일과 성별까지만 출력하기
		
		// "901231-1234567" 인 경우 "901231-1"까지만 출력
		// "030109-4574891" 인 경우 "030109-4"까지만 출력
		
		String id = "901231-1234567"; // 주민번호
		
		// 절대 애매하지 않은 -(하이픈)의 인덱스 값을 이용해서 성별을 나타내는 숫자 출력
		System.out.println(id.substring(0, id.indexOf("-") + 2)); // indexOf()의 값은 정수라서 사칙연산이 가능함
	}
}
