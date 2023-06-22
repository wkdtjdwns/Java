package games.word;

import java.util.Scanner;

public class Player {

	// 끝말잇기를 하기위해 필요한 클래스 -> main 필요 X (실행 안함)
	
	Scanner sc = new Scanner(System.in);
	
	// 필드(필요한 요소) - 플레이어를 구분할 이름, 해당 플레이어가 자신의 차례에 말할 단어 
	public String name; // 플레이어 이름
	public String word; // 해당 플레이어가 말할 단어
	
	// 메소드 선언
	// 플레이어가 단어를 말하는 메소드
	public String writeWord()
	{
		// 말할 단어를 입력받고
		word = sc.next();
		
		// 리턴함
		return word;
	}
	
	// 플레이어가 단어를 말했을 때 끝말잇기의 규칙에 적함한지 판단하는 메소드
	public boolean chkSuccess(char lastChar)
	{
		// 아버지 -> String은 인덱스를 가지기 때문에 아(0) 버(1) 지(2)로 저장 
		// charAt() 메소드를 통해 해당 인덱스의 문자를 가지고 올 수 있음
		if (lastChar == word.charAt(0))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
