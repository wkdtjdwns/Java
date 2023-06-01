package test;

public class Ex11 {

	// 1부터 10까지의 정수 중에서 랜덤한 수 뽑기
	// random() -> 0.0부터 0.9999999....까지의 난수
	public static void main(String[] args) {
	
		// 1부터 10까지의 정수가 아닌 50부터 100까지의 정수를 받고 싶어질 수 있으니 범위를 변수로 선언 해줌
		int range = 10; 
		int start = 1;
		
		// 1부터 10까지의 정수 중 랜덤한 값을 받는 법
		
		// int num;                                    // 변수 선언
		
		// num = Math.random();                        // random()을 사용하면 double(실수)형 값이 나오는데 num은 int(정수)형이기 때문에 오류가 뜸
		// num = Math.random() * range;                // 0.0 ~ 9.99999....
		// num = Math.random() * (range+start);        // 1.0 ~ 10.999999....
		// num = (int)(Math.random() * (range+start)); // 1 ~ 10
		
		// 1부터 10까지의 정수 3개를 랜덤으로 받아오지만 3개의 숫자가 서로 겹치지 않도록 받아서 출력하시오. 
		int a=0, b=0, c=0; // 랜덤으로 받을 3개의 변수  
		
		// 위의 방법을 사용해서 랜덤한 정수를 받음
		a = (int)(Math.random() * (range+start));
		b = (int)(Math.random() * (range+start));
		c = (int)(Math.random() * (range+start));
		
		
		while (a == b || b == c || c == a) // (a와 b의 값이 같음 || b와 c의 값이 같음 || c와 a의 값이 같음) -> 겹치는 숫자가 있음!!!
		{
			// 랜덤한 정수를 다시 받음
			a = (int)(Math.random() * (range+start));
			b = (int)(Math.random() * (range+start));
			c = (int)(Math.random() * (range+start)); 
		}		
		
		System.out.printf("%d, %d, %d", a, b, c);
	}
}
