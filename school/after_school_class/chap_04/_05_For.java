package chap_04;

public class _05_For {
	public static void main(String[] args) {
		// 반복문
		// 성일 매장
		System.out.println("어서오세요 성일매장입니다");
		// 또 다른 손님이 들어온다면
		System.out.println("어서오세요. 성일매장입니다.");
		System.out.println("어서오세요. 성일매장입니다.");
		System.out.println("어서오세요. 성일매장입니다.");
		System.out.println("어서오세요. 성일매장입니다.");

		
		// 만약 인사말이 바뀌면
		System.out.println("환영합니다. 성일매장입니다.");
		System.out.println("환영합니다. 성일매장입니다.");
		System.out.println("환영합니다. 성일매장입니다.");
		System.out.println("환영합니다. 성일매장입니다.");
		System.out.println("환영합니다. 성일매장입니다.");
		
		// 만약 매장 이름이 바뀌면
		// 성일 매장 - 소프트매장
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		System.out.println("환영합니다. 소프트매장입니다.");
		
		// 코드가 만 줄이 넘는 상황이고, 모든 코드에 대해 단순한 수정을 하는 상황이라면
		// 이 인사말들과 매장 이름들을 바꾸려면 많은 시간과 오타가 섞일 수 있음
		// 그래서 반복문이 필요함
		
		// 반복문(FOR) 사용
		
		// for (초기화; 조건; 증감) {
		//     반복될 코드
		// }
		
		// 0부터 9까지 10번 돌림 - 배열에서 많이 씀
		for (int i=0; i<10; i++) {
			// 1부터 10까지 출력
			System.out.println(i + 1); // i값이 0부터 9까지 올라가기 때문에 + 1 해서 출력함
		}
		// 만 줄이 넘는 내용을 바꿀 때에도 1개의 코드만 바꾸면 됨
		for (int i=0; i<10; i++) { 
			// System.out.println("어서오세요. 성일매장입니다.");
			// System.out.println("환영합니다. 성일매장입니다.");
			System.out.println("환영합니다. 소프트매장입니다.");
		}
		
		// 1부터 10까지의 정수 중 짝수만 출력하시오.
		
		// 나머지로 구하기 1
		for (int i=0; i<10; i++) {
			if (i % 2 != 0) {
				System.out.println(i+1);
			}
		}
		
		System.out.println("========");
		
		// 나머지로 구하기 2
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("========");
		
		// i를 2씩 증가시키기
		for (int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("========");
		
		// 10부터 1까지 출력
		
		// i를 10부터 시작해서 -1씩 증가시키기 (1씩 감소 시키기)
		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		System.out.println("========");
		
		// 1부터 100까지의 합 구하기
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
