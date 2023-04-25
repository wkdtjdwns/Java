package chap_04;

public class _08_NestedLoop {
	public static void main(String[] args) {
		// 이중 for문, 이중 반복문
		
		// ***** 출력
		for (int i=0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("=========\n");
		
		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * 출력
		 */
		
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5; j++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		System.out.println("=========\n");
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 출력
		 */
		
		// i값은 바꿀 필요 없고 j값만 바꾸면 됨
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========\n");
		
		/*
		 * ssss*
		 * sss**
		 * ss***
		 * s****
		 * *****
		 * 
		 *  출력
		 */
		
		for(int i=0; i<5; i++) {
			// s 출력
			for (int j=0; j<4-i; j++) {
				System.out.print("s");
			}
			// 별 출력
			for (int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		for(int i=0; i<5; i++) {
			// s 출력
			for (int j=i; j<4; j++) {
				System.out.print("s");
			}
			// 별 출력
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}
}
