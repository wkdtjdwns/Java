package S21221_00;

import java.util.Scanner;

public class S21221_03v51 {

	public static void main(String[] args){
		
        String[] s_day; // 배열 선언 (배열을 다루기 위한 참조 변수 선언)
        s_day = new String[5]; // 배열 생성 (실제 저장 공간을 생성)
        
        // 생성된 배열 변수에 값을 설정
        s_day[0] = "(1) 월요일이 좋다";
        s_day[1] = "(2) 화요일이 좋다";
        s_day[2] = "(3) 수요일이 좋다";
        s_day[3] = "(4) 목요일이 좋다";
        s_day[4] = "(5) 금요일이 좋다";
        
        int menu = 0;
        
        // 스캐너 변수 선언 (sc)하여 스캐너 입력장치로 읽음
        Scanner sc = new Scanner(System.in);
        
        while (true) {
        	for (int i = 0; i < s_day.length; i++) {
        		System.out.println(s_day[i]);
        	}
        	
        	System.out.print("좋아하는 날을 선택하세요 (종료 : 0) >>> ");
        	menu = sc.nextInt(); // 램퍼 (wrapper) 클래스를 이용해서 리턴
        	
        	if (menu == 0) {
        		System.out.println("프로그램을 종료합니다");
        		break;
        	} else if (!(1 <= menu && menu <= 5)) {
        		System.out.println("정확히 입력하세요");
        		continue;
        	}
        	
        	System.out.print("선택하신 것은 : ");
        	System.out.println("'" + s_day[menu - 1] + "' 입니다");
        }
        
        sc.close();
	}
}

/*
실행 결과
-----------------------------------------
(1) 월요일이 좋다
(2) 화요일이 좋다
(3) 수요일이 좋다
(4) 목요일이 좋다
(5) 금요일이 좋다
좋아하는 날을 선택하세요 (종료 : 0) >>> 2
선택하신 것은 : '(2) 화요일이 좋다' 입니다
(1) 월요일이 좋다
(2) 화요일이 좋다
(3) 수요일이 좋다
(4) 목요일이 좋다
(5) 금요일이 좋다
좋아하는 날을 선택하세요 (종료 : 0) >>> 5
선택하신 것은 : '(5) 금요일이 좋다' 입니다
(1) 월요일이 좋다
(2) 화요일이 좋다
(3) 수요일이 좋다
(4) 목요일이 좋다
(5) 금요일이 좋다
좋아하는 날을 선택하세요 (종료 : 0) >>> 0
프로그램을 종료합니다
*/
