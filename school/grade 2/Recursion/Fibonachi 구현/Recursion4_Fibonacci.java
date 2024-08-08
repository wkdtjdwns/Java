package s21200_recursion;

public class Recursion4_Fibonacci {

	static int fibonacci(int num) {
		System.out.println("fibonacci: " + num);
		if (num < 2) {
			return num;
		}
		
		else {
			System.out.println("fibonacci if: " + num);
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("fibonacci number: " + fibonacci(7));
	}
}

/*
실행 결과
---------------------
fibonachi: 7
fibonachi if: 7
fibonachi: 6
fibonachi if: 6
fibonachi: 5
fibonachi if: 5
fibonachi: 4
fibonachi if: 4
fibonachi: 3
fibonachi if: 3
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 1
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 3
fibonachi if: 3
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 1
fibonachi: 4
fibonachi if: 4
fibonachi: 3
fibonachi if: 3
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 1
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 5
fibonachi if: 5
fibonachi: 4
fibonachi if: 4
fibonachi: 3
fibonachi if: 3
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 1
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 3
fibonachi if: 3
fibonachi: 2
fibonachi if: 2
fibonachi: 1
fibonachi: 0
fibonachi: 1
fibonachi number: 13
*/
