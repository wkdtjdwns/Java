package s21200_recursion;

public class Recursion_SumPlus {

	static int sumPlus(int num) {
		System.out.println("int: " + num);
		if (num == 1) {
			return 1;
		}
		
		else {
			return num + sumPlus(num - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Sum: " + sumPlus(10));
	}
}

/*
실행 결과
--------
int: 10
int: 9
int: 8
int: 7
int: 6
int: 5
int: 4
int: 3
int: 2
int: 1
Sum: 55
*/
