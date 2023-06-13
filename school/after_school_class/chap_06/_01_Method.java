package chap_06;

public class _01_Method {

	// 메소드는 클래스 내에 있는 함수이다.
	// JAVA에서 함수는 클래스 내에서만 존재할 수 있다.
	// 그래서 JAVA에 한해서만 함수를 메소드라고 부르기로 했다. (함수 = 메소드)
	
	public static void main(String[] args) { // main 메소드(함수)
		
		System.out.println("메인입니다!"); // 여기까지는 실행 했을 때 "메인입니다!"라고만 출력됨 (main 메소드는 실행할 때 유일하게 실행되는 메소드이기 때문이다.)
		
		// 메소드 호출 (사용)
		// 메소드의 호출이 끝났다고 실행이 끝나는 것이 아닌 main 메소드가 모두 끝나야지 실행이 끝나는 것임
		System.out.println("메소드 호출 전");
		
		// 아래에서 정의한 메소드를 main 메소드에서 호출(사용)함
		hello(); 
		hello();
		hello(); 
		
		System.out.println("메소드 호출 후"); // main 메소드의 마지막 코드를 실행 후 모든 실행을 끝냄
	}
	
	// 메소드 정의
	public static void hello() // 새로 생성한 hello 메소드 "정의" (정의만 한 것이기 때문에 사용을 해야함)
	{
		System.out.println("Hello World!!!");
	}
	
	// 간략한 정리
	// public -> 어디에서든 호출 가능한 메소드라는 뜻
	// void -> 이 메소드는 return하는 값이 없다는 뜻 
}
