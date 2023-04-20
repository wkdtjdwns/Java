package chap_02;

public class _04_Operator4 {
	public static void main(String[] args) {
		// 논리 연산자
		boolean 치킨 = false;
		boolean 피자 = true;
		boolean 탕수육 = true;
		
		// && = And (모두가 true여야함)
		System.out.println(치킨 && 피자 && 탕수육); // 최고의 식단 => 모두 true일 때 true 
		// || = Or (하나만 true여도 됨)
		System.out.println(치킨 || 피자 || 탕수육); // 괜찮은 식단 => 하나라도 true면 true

		// And 연산
		System.out.println((5 > 3) && (3 > 1)); // true && true => true
		// And 연산은 거짓이 나올 수도 있는 식을 앞에 놓는 것이 좋다.
		System.out.println((5 < 3) && (3 > 1)); // false 값이 나온 순간 뒤에 연산은 하지 않는다.
		
		// Or 연산
		System.out.println((5 < 3) || (3 > 1)); // false || true => true
		// Or 연산은 참이 나올 수도 있는 식을 앞에 놓는 것이 좋다.
		System.out.println((5 > 3) || (3 > 1)); // true 값이 나온 순간 뒤에 연산은 하지 않는다.
		System.out.println((5 < 3) || (3 < 1)); // false || false => false
		
		// System.out.println(1 < 3 < 5);  묶어서 쓰는 수식은 불가능 하다.
		System.out.println((1 < 3) && (3 < 5));
		
		// 논리 부정 연산자
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // !(true 값이 나오는 식) = false
		System.out.println(!(5 == 3)); // !(false 값이 나오는 식) = true
	}
}
