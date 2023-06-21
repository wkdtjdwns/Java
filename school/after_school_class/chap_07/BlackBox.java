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
	
	static void callServieceCenter()
	{
		System.out.println("서비스센터(1588-0000)으로 연결합니다.");
		
//		modelName = "초록이";
//		같은 파일에서 접근 했지만 오류가 생김
//		-> 인스턴스 필드는 객체화 되어야지만 활용할 수 있기 때문
		
//		canAutoReport = false;
//		반면에 클래스 필드는 상관 없음
		
	}

//	복습
//	
//	// 필드
//	// 인스턴스 필드 - 각 개체 안에서 사용되는 필드
//	String modelName; // 모델명
//	String resolution; // 해상도
//	int price; // 가격
//	String color; // 색상
//	
//	// 클래스 필드 - 모든 객체에 공통적으로 적용하는 필드 (메모리에 올려놓음 -> static)
//	static boolean canAutoReport = false;
//	
//	// 생성자 : 클래스 이름과 같은 메소드
//	// 아래와 같이 빈 코드를 갖는 생성자를 기본생성자라고 함
//	// 개발자가 생성자를 따로 쓰지 않은 경우에는 자바에서 자동으로 기본 생성자를 생성해 줌
//	public void BlackBox() {}
//	
//	// 메소드 : 기능을 담당함
//	// 인스턴스 메소드 - 해당 객체에서만 사용할 수 있는 메소드
//	
//	void autoReport() // 파라미터 X , 리턴값 X
//	{
//		if (canAutoReport)
//		{
//			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
//		}
//		
//		else
//		{
//			System.out.println("자동 신고 기능이 지원되지 않습니다.");
//		}
//	}
//	
//	void insertMemoryCard(int capacity) // 파라미터 O, 리턴값 X
//	{
//		System.out.println("메모리 카드가 삽입되었습니다.");
//		System.out.println("용량은 " + capacity + "GB 입니다.");
//	}
//	
//	int getVideoFileCount(int type) // 파라미터 O, 리턴값 O
//	{
//		if (type == 1) // 일반 영상
//		{
//			return 9;
//		}
//		
//		else if (type == 2) // 이벤트 영상
//		{
//			return 2;
//		}
//		
//		else // 전체 영상
//		{
//			return 11;
//		}
//	}
//		
//	// showDateTime : 날짜/시간 정보
//	// showSpeed : 속도
//	// min : 영상 기록 단위
//	void record(boolean showDateTime, boolean showSpeed, int min)
//	{
//		System.out.println("녹화를 시작합니다.");
//				
//		if (showDateTime)
//		{
//			System.out.println("영상에 날짜/시간 정보가 표시됩니다.");
//		}
//				
//		else if (showSpeed)
//		{
//			System.out.println("영상에 속도 정보가 표시됩니다.");
//		}
//				
//		System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
//	}
//	
//	// 오버로딩 : 파라미터의 갯수가 다름
//	void record(int min) // 파라미터 1개
//	{
//		record(true, true, min);
//	}
//	
//	void record() // 파라미터 0개
//	{
//		record(true, true, 5);
//	}
}
