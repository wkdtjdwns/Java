// 구구단을 단보다 곱하는 수가 작거나 같은 경우만 출력
// 2 * 1 = 2
// 2 * 2 = 4
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
// 4 * 1 = 4
// .....

package chap_04;

public class _Quiz_03 
{
	public static void main(String[] args) 
	{
		for (int i=2; i<=9; i++) 
		{
			for (int j=1; j<=9; j++) 
			{
				if (i<j) 
				{
					continue;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		// break 도 가능
		for (int i=2; i<=9; i++) 
		{
			for (int j=1; j<=9; j++) 
			{
				if (i<j) break;
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
