package chap_04;

public class _06_While {
	public static void main(String[] args) {
		// 반복문 while => 얼마나 반복을 돌려야 할지 명확하지 않을 때 사용함
		// 수영장에서 수영을 하는 모습
		
		int distance = 25; // 수영장 전체 길이 25m
		int move = 0; // 전체 이동거리 0m
		
		/*
		 * while (조건식) {
		 * 		반복될 코드!!
		 * 		꼭 증감을 포함해야함 (단, 무한루프를 의도적으로 돌릴때는 없어도 됨)
		 * }
		 */
		
		int cnt = 0; // 도착까지 걸린 시간 (초)
		while (move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동거리 : " + move);
			move += 3; // 3m 이동
			cnt++; 
			if (move == 15) {
				break;
			}
		}
		System.out.println(cnt + "초에 도착!!!");
	}
}
