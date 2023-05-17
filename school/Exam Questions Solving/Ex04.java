package exam;

import java.util.Scanner; // 입력을 받기 위한 명령어를 쓰기 위해 import 해줌

public class Ex04 {

//  체중과 키를 활용하여 아래 표와 같이 비만도(bmi)를 계산할 수 있다. (키 / (키 * 몸무게)
	
/*  bmi < 18.5 -> 저체중
 *  18.5 < bmi < 25 -> 건강 
 *  25 < bmi < 30 -> 과체중
 *  bmi > 30 -> 비만
 */
	
//  체중이 70이고 키가 1.7일 때의 비만도 측정 결과는?
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력할 수 있게 해주는 명령어 (Python의 input()과 유사함)
		
		System.out.println("키를 입력하세요.");
		double height = sc.nextDouble();     // 입력 받는 방법 (double형)
		height /= 100;
		
		System.out.println("몸무게를 입력하세요.");
		double weight = sc.nextDouble();
		
		sc.close();                          // Scanner를 사용할 때는 다 쓰고나서 닫아 줘야 함
		
		double bmi = height / (height * weight);
		
		System.out.println("키 : " + height + ", 몸무게 : " + weight);
		System.out.printf("당신의 비만도수치 %.2f 인 당신은 ", bmi); // format을 사용한 출력문
		
		if (bmi < 18.5) System.out.println("저체중");
		else if (bmi < 24.9) System.out.println("건강");
		else if (bmi < 29.9) System.out.println("과체중");
		else if (bmi > 30) System.out.println("비만");
		else System.out.println("오류");
	}
}
