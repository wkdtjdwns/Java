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
	
	// return 값이 있는 메소드
	int getVideoFileCount(int type)
	{
		if (type == 1) // 일반 영상
		{
			return 9;
		}
		
		else if (type == 2) // 이벤트 영상
		{
			return 2;
		}
		
		return 11;
	}
	
	// 화면 녹화 기능 구현에 필요한 변수
	// showDateTime : 날짜 정보 표시 여부
	// showSpeed : 속도 정보 표시 여부
	// min : 영상 기록 단위(분)
	void record(boolean showDateTime, boolean showSpeed, int min)
	{
		System.out.println("녹화를 시작합니다.");
		
		if (showDateTime)
		{
			System.out.println("영상에 날짜/시간 정보가 표시됩니다.");
		}
		
		// 날짜 정보 표시와 속도 정보 표시는 별도의 내용이기 때문에 else if 사용 X
		if (showSpeed)
		{
			System.out.println("영상에 속도 정보가 표시됩니다.");
		}
		
		System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
	}
	
	// 사용자가 기록 단위만 조작한 상태는 모두 활성화되고 N분 간격으로 녹화를 함
	// 상태 -> 파라미터의 값이 min 한개 뿐임! (파라미터의 개수가 다름 -> 오버로딩)
	void record(int min) 
	{
		// 위에서 선언한 메소드를 불러옴
		record(true, true, min);
	}
	
	// 사용자가 조작하지 않은 상태는 모두 활성화되고 5분 간격으로 녹화를 함
	// 상태 -> 파라미터의 값이 없음 (0개) (파라미터의 개수가 다름 -> 오버로딩)
	void record()
	{
		// 위에서 선언한 메소드를 불러옴
		record(true, true, 5);
	}
}
