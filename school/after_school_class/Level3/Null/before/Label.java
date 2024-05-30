package nullLabel.before;

public class Label {

	private String label;
	
	public Label(String label) {
		this.label = label;
	}
	
	public void display() {
		System.out.println("display : " + label);
	}
	
	// Person 클래스에서만 toString()을 오버라이딩하면
	// Label 클래스의 toString()은 그대로 부모의 것이기 때문에
	// Label 클래스의 toString() 또한 오버라이딩 함.
	@Override
	public String toString() {
		return "\"" + label +  "\"";
	}
}
