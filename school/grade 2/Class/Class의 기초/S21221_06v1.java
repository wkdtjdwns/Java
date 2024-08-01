package S21221_00;

public class S21221_06v1 {

	public static void main(String[] args){
		
		// Tv 클래스 인스턴스룰 참조하기 위한 변수 t 선언 및 초기화
		Tv t = new Tv();
        
		t.cannel = 7; // Tv 인스턴스 멤버 변수에 값 설정
		t.channelDown();
		System.out.println("a현재 채널은 " + t.cannel + "입니다");
		
		t.channelUp();
		System.out.println("b현재 채널은 " + t.cannel + "입니다");
	}
}

class Tv {
	// TV의 속성 (멤버 변수)
	String color;
	boolean power;
	int cannel;
	
	// TV의 기능 (메서드)
	void power() { power = !power; }
	void channelUp() { ++cannel; }
	void channelDown() { --cannel; }
}

/*
실행 결과
-------------------
a현재 채널은 6입니다
b현재 채널은 7입니다
*/
