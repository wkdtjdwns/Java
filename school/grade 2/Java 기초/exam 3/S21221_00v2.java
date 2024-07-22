package S21221_00;

public class S21221_00v2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
    int odd = 0;
    int even = 0;

    for (int cnt = 1; cnt < 11; cnt++)
    {
        sum += cnt;
        if (cnt % 2 == 0) {
           even += cnt;
        }

        else {
            odd += cnt;
        }
        System.out.println("cnt : " + cnt + " odd : " + odd + " even : " + even + " sum : " + sum);
    }
    System.out.println("sum : " + sum);
	}
}
