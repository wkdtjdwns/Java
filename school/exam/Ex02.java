package exam;

public class Ex02 {

	public static void main(String[] args) {
		int result = 0;
		
		for (int i=1; i<4; i++) {
			for (int j=1; j<i+1; j++) {
				result = result + j;
			}
		}
		
		System.out.println(result);
	}
}

/* 위의 코드의 실행결과로 옳은 것을 고르시오.
 * 
 * 1. 12
 * 2. 10
 * 3. 11
 * 4. 9 
 */

 // 정답 -> 2번 (10)

 // 풀이 - i		1		2		3
 //       j	   j<2     j<3     j<4

 //       j     1      1,2    1,2,3

 // 더하면 1 + 1 + 2 + 1 + 2 + 3 = 10
