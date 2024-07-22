package S21221_00;

public class S21221_01v3 {

	public static void main(String[] args) {
		boolean stop = true;
		
		// 선언할 때 변수명이 똑같은 까닭에 에러가 남 
//		boolean stop = false;
		
		// 에러를 없애려면 선언이 아닌 변수의 값을 바꿔야함
		stop = false;
		
		int i = 10;
		
		// if (stop) -> stop의 값이 참일 경우 실행
		// if (i > 9) -> i의 값이 9보다 클 때 실행
		if (i > 9) { System.out.println("운행을 중지합니다."); }
		else { System.out.println("운행을 시작합니다."); }
	}
}

/*
실행 결과
------------------
운행을 중지합니다.
*/
