package test0000;

public class Calculator {

	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(3, 4));		// 7
		System.out.println(c.add(2, 4, 8));		// 14
		System.out.println(c.add(3.14, 2.54));	// 5.68
	}
}

/*
실행 결과
--------
7
14
5.68
*/
