package S21221_java10;

import S21221_java11.Matiz; // 다른 패키지에 있기 때문에 import 해줌

public class Chap01 {
	
	public static void main(String[] args) {
	
		Animal animal = new Animal();
		animal.a();
		
		Dog dog = new Dog();
		dog.a();
		
		Fish fish = new Fish();
		fish.a();
		
		Bird bird = new Bird();
		bird.a();
		
		Matiz matiz = new Matiz();
		matiz.a();
	}
}

/*
실행 결과
-----------------------------------------------------------------
1. Animal_public 접근 제한자를 알아봅시다.
2. Dog_protected 상속의 오버라이딩 난 멍멍이입니다^^
3. Fish_public 상속의 오버리이딩 난 바다에 사는 횟감용 돌돔입니다.
4. Bird_default 새도 합류합니다^^
5. Matiz_public 패키지를 넘나들며 멍과 바다에 갑니다.
*/
