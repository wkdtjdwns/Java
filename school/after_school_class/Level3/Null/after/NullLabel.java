package nullLabel.after;

// Label의 값이 null일 경우에 사용하는 클래스
public class NullLabel extends Label {

	// Label에 null값이 들어왔을 때
	public NullLabel() {
		
		// 부모 생성자에 null 대신 (none)이라는 글자를 넣음.
		super("(none)");
	}
	
	// 이 클래스는 null일 때 사용되는 클래스이기 때문에
	// 부모와 다르게 isNull()의 값이 false가 아닌 true야 함.
	@Override
	public boolean isNull() { 
		return true;
	}
	
	// null이면 출력하면 안 되기 때문에 출력하지 않게 함.
	@Override
	public void display() {
		
	}
}
