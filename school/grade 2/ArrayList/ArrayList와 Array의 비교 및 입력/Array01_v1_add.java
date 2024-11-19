package arraylist.ArrayList01;

import java.util.Arrays;
import java.util.ArrayList;

public class Array01_v1_add {

	public static void main(String[] args) {
		
		// 타입 배열					크기
		String[] array = new String[10]; // 배열 자료형
		
		// 리스트 자료형 타입					크기 (기본 10)
		ArrayList<String> list = new ArrayList<>(); // 리스트 자료형<> 제네릭(General 일반적)
		
		System.out.println("--------------------------------------------");
		System.out.println("* Array와 ArrayList의 크기");
		System.out.println("--------------------------------------------");
		System.out.println("저장 전 array length: " + array.length);
		System.out.println("저장 전 ArrayList size: " + list.size());
		
		array[0] = "One";
		array[1] = "Two";
		array[2] = "Three";
		
		// 인원 추가 시 인덱스 위치 설정 필수
		// array[3] = "Four";
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		// 인원 추가 시 순서가 관계 없다면 저장된 데이터 바로 뒤에 삽입
		// list.add("four");

		System.out.println("--------------------------------------------");
		System.out.println("* Array와 ArrayList에 저장된 내용");
		System.out.println("--------------------------------------------");
		System.out.print("Array:		");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// System.out.println(Arrays.toString(array));
		// java.util.Arrays.toString() 메서드 사용
		
		System.out.println("");
		System.out.print("ArrayList:	");
		for (String str : list) {
			System.out.print(str + " ");
		}
		// System.out.println(list); // ArrayList 전체 출력
	}
}

/* 실행 결과
 * --------------------------------------------
 * * Array와 ArrayList의 크기
 * --------------------------------------------
 * 저장 전 array length: 10
 * 저장 전 ArrayList size: 0
 * --------------------------------------------
 * * Array와 ArrayList에 저장된 내용
 * --------------------------------------------
 * Array:		One Two Three null null null null null null null 
 * ArrayList:	One Two Three 
 */
