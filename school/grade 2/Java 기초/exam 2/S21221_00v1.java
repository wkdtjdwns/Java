package S21221_00;

public class S21221_00v1 {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for (int cnt = 1; cnt < 11; cnt++)
		{
			sum += cnt;
			System.out.println("cnt : " + cnt + " sum : " + sum);
		}
		System.out.println("sum : " + sum);
	}
}
