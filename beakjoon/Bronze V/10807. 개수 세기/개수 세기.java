import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];    
        int cnt = 0;
        for(int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        sc.close();
        for(int i = 0; i < array.length; i++)
        {  	
            if (v == array[i])
            { 
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
