package S212_java70;

class Tv {
	// Tv의 속성 (멤버변수)
	int channel; // 채널
	
	// Tv의 기능 (메서드)
	void channelUp() { ++channel; }		// Tv의 채널을 높이는 기능
	void channelDown() { --channel; }	// Tv의 채널을 낮추는 기능
}

class SmartTv extends Tv { // Tv 클래스를 상속받음
	// SmartTv만의 속성 (멤버변수)
	boolean caption = true;
	
	// SmartTv만의 기능 (메서드)
	void displayCaption(String text) {
		
		if (caption) {
			System.out.println(text);
		}
	}
}

public class S21221_70_1 {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		// 조상 클래스 (Tv)로부터 상속받은 멤버를 사용함
		smartTv.channel = 10;	// SmartTV 클래스에 직접 적혀있지 않지만 Tv 클래스에서 상속받아서 사용함
		smartTv.channelUp();	// SmartTV 클래스에 직접 적혀있지 않지만 Tv 클래스에서 상속받아서 사용함
		System.out.println(smartTv.channel);
		
		smartTv.displayCaption("2학년 12반 전체");
		smartTv.displayCaption("2학년 12반 사랑한다 친구야~");
		
		smartTv.caption = false; // SmartTv의 caption 값 변경
		smartTv.displayCaption("사실 안 사랑해 친구들아~");
	}
}

/*
실행 결과
---------------------------
11
2학년 12반 전체
2학년 12반 사랑한다 친구야~
*/
