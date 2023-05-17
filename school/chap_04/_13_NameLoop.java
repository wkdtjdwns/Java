package chap_04;

public class _13_NameLoop 
{
	public static void main(String[] args) 
	{ 
		// 이름 있는 반복문
		
		/*
		for (int i=2; i<=9; i++) 
		{
			for (int j=1; j<=9; j++) 
			{
				if (j == 5) break; // break는 자신이 포함되어 있는 반복문만 벗어남
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		for (int i=2; i<=9; i++) 
		{
			for (int j=1; j<=9; j++) 
			{
				if (j == 5) continue; // continue도 마찬가지로 포함되어 있는 반복문에서만 작동함
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		*/
		
		Loop1: // for 문에 이름을 정해줘서 활용할 수 있음
			for (int i=2; i<=9; i++) 
			{
				for (int j=1; j<=9; j++) 
				{
					if (j == 5) break Loop1; // 원래는 작은 for문만 멈췄지만 큰 for문의 이름인 Loop1을 멈추니 큰 for문이 멈춤
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		
		Loop1: 
			for (int i=2; i<=9; i++) 
			{
				for (int j=1; j<=9; j++) 
				{
					if (j == 5) continue Loop1; // continue 또한 마찬가지로 큰 for문에서 작동시킬 수 있음
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
	}
}
