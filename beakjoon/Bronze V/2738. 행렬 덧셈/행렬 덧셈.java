import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        
        // n*m 크기의 2차원 배열
        int[][] a = new int[n][m];

        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<m; j++)
            {
            	// 순서대로 배열 a에 입력받음
                a[i][j] = sc.nextInt();
	    }
	}
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<m; j++) 
            {
            	// 순서대로 더하고 출력함
                a[i][j] += sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
	sc.close()
    }
}
