package s21200_recursion;

public class Recursion2_Factorial {

	static int factorial(int num) {
		System.out.println("int: " + num);
		if (num == 1) {
			return 1;
		}
		
		else {
			return num * factorial(num - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Factorial: " + factorial(5));
	}
}

/*
실행 결과
---------------
int: 5
int: 4
int: 3
int: 2
int: 1
Factorial: 120
*/
