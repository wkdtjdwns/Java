package S21221_00;

// System.in.read() 메소드를 사용하기 위한 import
import java.io.IOException;

public class S21221_01v6 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 알고리즘 분석
		 * 
		 * 다른 KeyCode가 들어오면 while문을 빠져나가지 않고
		 * KeyCode가 113일 때만 break를 사용해서 while문을 빠져나온 뒤
		 * 알고리즘을 종료함
		 */
		
		int key_code;
		
		while (true)
		{
			System.out.print("키코드 입력 >>> ");
			
			key_code = System.in.read();
			System.out.println("KeyCode : " + key_code);
			
			if (key_code == 113)
			{
				System.out.println("종료");
				break;
			}
			
			key_code = System.in.read();
			System.out.println("KeyCode : " + key_code);
			
			key_code = System.in.read();
			System.out.println("KeyCode : " + key_code);
			
			System.out.println();
		}
	}
}

/*
실행 결과
-----------------
키코드 입력 >>> A
KeyCode : 65
KeyCode : 13
KeyCode : 10

키코드 입력 >>> B
KeyCode : 66
KeyCode : 13
KeyCode : 10

키코드 입력 >>> q
KeyCode : 113
종료
*/
