import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[3];
		for (int i=0; i<3; i++) 
		{
			int n = Integer.parseInt(br.readLine());
			nums[i] = n;
		}
		Arrays.sort(nums);
		System.out.println(nums[1]);
	}
}
