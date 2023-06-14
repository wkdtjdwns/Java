package chap_07;

public class BlackBox {

	// 어느 곳에서든 가져다가 사용하게 만들기 위한 클래스임
	// -> main 메소드 필요 없음 (실행할 것이 없다는 뜻임)
	
//	 클래스의 구성 요소 - 필드	
	// 블랙박스 제작에 필요한 요소 (값 할당 X)
	String modelName;  // 모델명
	String resolution; // 해상도
	int price;         // 가격
	String color;      // 색상
	

//	클래스 변수
//	모든 객체에 공통적으로 필요한 변수는 클래스에서 생성함 (클래스 변수 : 모든 인스턴스에 영향을 미침)
	// 선언법 - static 데이터타입 변수명 = 변수값; (클래스 변수는 값 할당을 해주어야 함)
	static boolean canAutoReport = false; // 자동신고기능
	// boolean canAutoReport;
	
//	클래스 메소드 선언
	// 자동신고 기능 여부를 안내하는 메소드
	void autoReport()
	{
		if (canAutoReport)
		{
			System.out.println("자동 신고 기능이 활성화 되었습니다.");
		}
		
		else 
		{
			System.out.println("자동 신고 기능이 활성화 되지 않았습니다.");
		}
	}
	
	// 메모리카드를 삽입하는 메소드
	void insertMemoryCard(int capacity)
	{
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.println("용량은 " + capacity + " GB 입니다.");
	}
}
