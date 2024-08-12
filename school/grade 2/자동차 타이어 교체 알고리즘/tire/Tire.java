package tire;

public class Tire {

	// 필드
	public int maxRotation;				// 최대 회전수 (최대 수명)
	public int accumulatedRotationl;	// 누적 회전수
	public String location;				// 타이어의 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotationl;
		
		// 타이어 펑크 여부 판단
		if (accumulatedRotationl < maxRotation) {
			System.out.println(location + " Tire 수명: " +
					(maxRotation - accumulatedRotationl) + "회"); // 타이어 수명
			
			return true;
		}
		
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
