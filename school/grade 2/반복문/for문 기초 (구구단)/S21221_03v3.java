package S21221_00;

import java.util.Scanner;

public class S21221_03v3 {

	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("구구단을 몇단까지 할까요? : ");
        int n = sc.nextInt();
        
        for (int i = 2; i <= n; i++) {
            System.out.println(i + "단 입니다.");
            
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
            
            System.out.println("============");
        }
        
        sc.close();
	}
}

/*
실행 결과
----------------------------
구구단을 몇단까지 할까요? : 3
2단 입니다.
2*1 = 2
2*2 = 4
2*3 = 6
2*4 = 8
2*5 = 10
2*6 = 12
2*7 = 14
2*8 = 16
2*9 = 18
============
3단 입니다.
3*1 = 3
3*2 = 6
3*3 = 9
3*4 = 12
3*5 = 15
3*6 = 18
3*7 = 21
3*8 = 24
3*9 = 27
============
*/
