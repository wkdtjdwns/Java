package chap_05;

public class _04_MultiArrayLoop {
	
	public static void main(String[] args) {
		// 다차원 배열순회 - 순차적으로 다차원 배열의 값을 모두 돌아봄
		
		String[][] seats = new String[][] 
		{	
			{"A1", "A2", "A3", "A4", "A5"}, 
			{"B1", "B2", "B3", "B4", "B5"},
			{"C1", "C2", "C3", "C4", "C5"}
		};
		
		// 다차원 배열을 순회하려면 반복문도 똑같이 다중 for문으로 돌려줘야함
		for (int i=0; i<3; i++) 
		{
			for (int j=0; j<5; j++) 
			{
				// j의 값이 5보다 작지 않으면 i의 값을 증가시킴
				// 즉, [0][0] ->[0][1] -> ... -> [1][0] -> [1][1] -> ... -> [2][0] -> [2][1] -> ...
				// 순서로 순회함
				System.out.print(seats[i][j] + " ");
			}
			System.out.println(); // 줄바꿈
		}
		
		// A1 부터 J15까지 출력		
		
		// 2차원 배열의 값 할당
		String[][] seats3 = new String[10][15];
		String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		
		for (int i=0; i<seats3.length; i++) // 행의 길이
		{
			for (int j=0; j<seats3[i].length; j++) // 열의 길이
			{
				seats3[i][j] = eng[i] + (j+1);
			}
		}
		
		// 2차원 배열의 값 출력
		for (int i=0; i<seats3.length; i++)
		{
			for (int j=0; j<seats3[i].length; j++)
			{
				System.out.print(seats3[i][j] + " ");
			}
			System.out.println(); // 줄바꿈
		}
	}
}
