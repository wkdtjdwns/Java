package games.word;

import java.util.Scanner;

public class WordGameApp {

	// 끝말잇기를 실질적으로 실행하는 클래스
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String startWord = "성일정보고"; // 시작 단어를 임의로 설정함
		
		System.out.println("끝말잇기 게임을 시작합니다!");
		System.out.print("게임에 참여하는 인원은 몇 명입니까? >> ");
		
		int playerNum = sc.nextInt();
		
		// 문자열 타입의 3칸짜리 배열 strArr 만들기
//		String[] strArr = new String[3];
		
		// ☆굉장히 중요함☆
		// Player 클래스도 String과 같은 참조형 변수로 볼 수 있음
		// 그래서 문자열 타입의 배열을 만들듯이 Player 타입의 배열을 만들 수 있음
		Player[] play = new Player[playerNum]; // 입력한 숫자만큼 Player 타입의 배열 생성
		
		for (int i=0; i<play.length; i++) // 플레이어의 수 만큼 반복
		{
			// 플레이어들의 이름 입력받기
			System.out.println("참가자의 이름을 입력하세요 >>");
			
			// 클래스 변수에 접근하기 전에 객체화 시킴
			play[i] = new Player(); // 배열 변수를 인스턴스화 시킬 수 있음
			
			// 객체화 시킨 후에 클래스 변수에 접근함
			play[i].name = sc.next();
		}
		
		// 실제 게임 실행
		System.out.printf("시작하는 단어는 %s입니다.\n", startWord);
		
		// 턴을 바꾸기 위한 변수
		int i=0, j=0;
		
		while (true)
		{
			// ★턴을 반복하기 위한 코드 / 응용하기 굉장히 좋은 코드
			i = j % playerNum;
			
			int lastIndex = startWord.length() - 1; // 단어의 제일 마지막 글자 인덱스
			char lastChar = startWord.charAt(lastIndex);
			
			// 턴마다 해당 턴의 플레이어가 입력하게 함
			System.out.println(play[i].name + " >> ");
			play[i].writeWord();
			
			// 끝말잇기의 규칙을 잘 지켰는 지 확인
			boolean counting = play[i].chkSuccess(lastChar);
			
			if (!counting) // 규칙을 지키지 못했다면
			{
				System.out.println(play[i].name + "님이 졌습니다.");
				break;
			}
			
			// 규칙을 지켰다면 시작 단어 및 턴을 초기화 시킴
			startWord = play[i].word;
			j++;
		}
		
		sc.close();
	}
}
