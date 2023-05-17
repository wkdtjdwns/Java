package exam;

public class Ex01 {

	public static void main(String[] args) {
		int point = 1000;
		
		if (point <= 1000 || point != 1000) {
			System.out.println("정답1");
		} else if (point >= 1000) {
			System.out.println("정답2");
		} else {
			System.out.println("정답3");
		}
	}
}	

/* 위의 코드의 실행 결과로 옳은 것을 고르시오.
 * 
 * 1. 정답1
 * 2. 정답2
 * 3. 정답3
 * 4. 오류
 */
		
 // 정답 -> 1번 (정답1)
		
 // 풀이 - 첫번째 if문에 ||(OR) 기호가 있기 때문에 어느 한쪽의 조건을 만족해도 true를 반환 해주기 때문에 첫번째 if문이 실행되는데
 //       if - else if - else문에서 하나의 조건식이 참이면 나머지 코드를 실행하지 않기 때문에 "정답1" 이 출력됨
