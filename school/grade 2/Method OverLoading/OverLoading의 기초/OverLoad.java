package S21221_java30;

public class OverLoad {

	public void cal() {
		System.out.println("인수 없음");
	}
	
	public void cal(int a, int b) {
		System.out.println("인수 " + a + " and " + b);
	}
	
	public void cal(int a, double b) {
		System.out.println("인수 " + a + " and " + b);
	}
	
	public void cal(double a, int b) {
		System.out.println("인수 " + a + " and " + b);
	}
	
	public void cal(double a, double b) {
		System.out.println("인수 " + a + " and " + b);
	}
	
	public void cal(double d) {
		System.out.println("인수 " + d);
	}
	
	public void cal(int d) {
		System.out.println("인수 " + d);
	}
	
	public void cal(char d) {
		System.out.println("인수 " + d);
	}
}
