package S21221_00;

import java.util.Scanner;

public class S21221_03v5 {

	public static void main(String[] args){
		
        int menu = 0;
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("(1) 월요일이 좋다");
            System.out.println("(2) 수요일이 좋다");
            System.out.println("(3) 금요일이 좋다");
            System.out.println("(4) 학교 가는 날은 다 좋다");
            System.out.println("좋아하는 날을 선택하세요 (종료 : 0)");
            
            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);
            
            if (menu > 4 || menu < 0) 
            {
                System.out.println("0 이상, 5 미만에 값을 입력해야합니다");
                continue;
            }
            
            else if (menu == 0)
            {
                System.out.println("종료");
                break;
            }
            
            System.out.printf("선택하신 번호는 %d번 입니다.\n", menu);
        }
        
        sc.close();
	}
}

/*
실행 결과
------------------------------------
(1) 월요일이 좋다
(2) 수요일이 좋다
(3) 금요일이 좋다
(4) 학교 가는 날은 다 좋다
좋아하는 날을 선택하세요 (종료 : 0)
1
선택하신 번호는 1번 입니다.
(1) 월요일이 좋다
(2) 수요일이 좋다
(3) 금요일이 좋다
(4) 학교 가는 날은 다 좋다
좋아하는 날을 선택하세요 (종료 : 0)
2
선택하신 번호는 2번 입니다.
(1) 월요일이 좋다
(2) 수요일이 좋다
(3) 금요일이 좋다
(4) 학교 가는 날은 다 좋다
좋아하는 날을 선택하세요 (종료 : 0)
0
종료
*/
