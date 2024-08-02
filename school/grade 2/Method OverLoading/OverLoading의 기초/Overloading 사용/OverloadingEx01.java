package test0000;

public class OverloadingEx01 {

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public void add(int a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		
		OverloadingEx01 ol = new OverloadingEx01();
		
		ol.add(1, 2);	// 3
		ol.add(2.5, 8);	// 10.5
		ol.add(3, 5.5);	// 8.5
	}
}

/*
실행 결과
--------
3
10.5
8.5
*/
