package S21221_00;

// System.in.read() 메소드를 사용하기 위한 import
import java.io.IOException;

public class S21221_01v51 {

	// throws IOException : System.in.read()를 사용하기 위한 코드
	public static void main(String[] args) throws IOException {
	
		// read()는 사용자의 입력 중 단 1개의 입력만 ASCII 코드로 받아옴
		System.out.print("키코드 입력 >>> ");
		
		int key_code = System.in.read();
		System.out.println("KeyCode : " + key_code);
	}
}

/*
실행 결과
-----------------
키코드 입력 >>> 5
KeyCode : 53
*/
