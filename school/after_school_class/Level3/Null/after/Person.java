package nullLabel.after;

public class Person {

	private Label name;
	private Label mail;
	
	public Person(Label name, Label mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public Person(Label name) {
		// Null 대신 NullLabel 클래스 사용
		this(name, new NullLabel());
	}
	
	public void display() {
		
		name.display();
		mail.display();
	}
	
	// 모든 클래스의 부모인 Object 클래스의 toString()을 오버라이딩 함.
	@Override
	public String toString() {
		return "[ Person : name = " + name + " mail : " + mail + " ]";
	}
}
