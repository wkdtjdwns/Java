package S21221_00;

import java.io.IOException;

public class S21221_01v5Test {

	public static void main(String[] args) throws IOException {

		int key_code;
		
		System.out.print("키코드 입력 >>> ");
		
		key_code = System.in.read();
		System.out.println("KeyCode : " + key_code);
		
		key_code = System.in.read();
		System.out.println("KeyCode : " + key_code);
		
		key_code = System.in.read();
		System.out.println("KeyCode : " + key_code);
		
		/*
		 * A를 입력했다고 가정함 (A를 입력한 뒤 ENTER를 침)
		 * 
		 * 먼저 A의 아스키 코드인 65가 출력된 후 사용자가 누른 ENTER의 아스키 코드인 13이 출쳑된 뒤 println()에서 사용한 줄바꿈의
		 * 아스키 코드인 10이 출력됨
		 */
	}
}

/*
실행 결과
-----------------
키코드 입력 >>> A
KeyCode : 65
KeyCode : 13
KeyCode : 10
*/
