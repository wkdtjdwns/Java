package s21200_recursion;

public class Recursion5_Gugudan {

	static void gugudan(int level, int count) {
		if (count > 9) {
			return;
		}
		
		else {
			System.out.printf("%d * %d = %d\n", level, count, (level * count));
			gugudan(level, ++count);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Gugudan print");
		gugudan(2, 1);
	}
}

/*
실행 결과
--------------
Gugudan print
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
*/
