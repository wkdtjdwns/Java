package chap_02;

public class _01_Operator {
	public static void main(String[] args) {
		// 산술연산 - 이항연산
		System.out.println(4 + 2);
		System.out.println(4 - 2);
		System.out.println(4 * 2);
		System.out.println(4 / 2);
			
		// 배수(홀/짝, 3의 배수,...) 구할 때 사용
		System.out.println(5 & 3); // 나머지 연산자
			
		// 나눠지는 값이 양수면 나누는 값에 상관없이 양수
		System.out.println(8 % 3); // 2
		System.out.println(8 % -3); // 2
			
		// 나눠지는 값이 음수면 나누는 값에 상관없이 음수
		System.out.println(-8 % 3); // -2
		System.out.println(-8 % -3); // -2
			
		// 우선 순위 연산
		System.out.println(2 + 2 * 2); // 6
		System.out.println((2 + 2) * 2); // 8
			
		// 변수를 이용한 연산
		int num1 = 20;
		int num2 = 10;
		int result;
			
		result = num1 + num2; 
		System.out.println(result); // 20 + 10 = 30
			
		result = num1 - num2;
		System.out.println(result); // 20 - 10 = 10
		
		result = num1 * num2;
		System.out.println(result); // 20 * 10 = 200
			
		result = num1 / num2;
		System.out.println(result); // 20 / 10 = 2
			
		result = num1 % num2;
		System.out.println(result); // 20 % 10 = 0
		
		/*
		 * 증감 연산자의 위치에 따라 두가지 유형으로 분류
		 * 
		 * 증감 연산 ++, --
		 * 
		 * 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
		 * 감소연산자(--): 피연잔자의 값을 1 감소시킨다.
		 * 
		 * 전위형 / j = ++i / 값이 참조되기 전에 증가 시킨다.
		 * 후위형 / j = i++ / 값이 참조되기 전에 증가 시킨다.
		 * 
		 */
			 
		int val;
	    	// 증가 시키기(++)
	    	val = 10;
	   	System.out.println(val); // 10
	    	System.out.println(val++); // 10 : 해당문장이 실행 완료된 후에 1 증가
	        System.out.println(val); // 11
			
		val = 10;
		System.out.println(val); // 10
		System.out.println(++val); // 11 : 해당문장이 실행 완료되기 전에 1 증가
		System.out.println(val); // 11
			
		// 감소 시키기(--)
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10 : 해당문장이 실행 완료된 후에 1 감소
		System.out.println(val); // 11
			
		val = 10;
		System.out.println(val); // 10
		System.out.println(--val); // 11 : 해당문장이 실행 완료되기 전에 1 감소
		System.out.println(val); // 11
			
		// 은행 대기번호 표
		int waiting = 0;
		System.out.println("대기 인원 : " + waiting++); // 내가 처음 뽑았기 때문에 아직은 대기번호가 없음
		System.out.println("대기 인원 : " + waiting++); // 하지만 다른 사람은 대기 인원이 1명있음
		System.out.println("대기 인원 : " + waiting++); // 또 다른 사람은 대기 인원이 2명
		System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원은 2명(다른 사람, 또 다른 사람)있음
	}
}
