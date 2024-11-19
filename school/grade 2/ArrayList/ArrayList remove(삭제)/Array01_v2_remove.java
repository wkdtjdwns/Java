package arraylist.ArrayList01;

import java.util.Arrays;
import java.util.ArrayList;

public class Array01_v2_remove {

	public static void main(String[] args) {
		
		String[] array = new String[10];
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("--------------------------------------------");
		System.out.println("* Array와 ArrayList의 크기");
		System.out.println("--------------------------------------------");
		System.out.println("저장 전 array length: " + array.length);
		System.out.println("저장 전 ArrayList size: " + list.size());
		
		array[0] = "One";
		array[1] = "Two";
		array[2] = "Three";
		array[3] = "Four";
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("four");

		System.out.println("저장 후 array length: " + array.length);
		System.out.println("저장 후 ArrayList size: " + list.size());
		
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
		for (String str : list) { // 데이터 하나씩 출력
			System.out.print(str + " ");
		}
		// System.out.println(list); // ArrayList 전체 출력

		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("* Array와 ArrayList에 저장된 내용 삭제");
		System.out.println("--------------------------------------------");
		
		// 삭제 배열명.remove[index];
		array[2] = "";
		list.remove(2); // 인덱스에 없는 데이터 삭제시 메세지 확인 -> list.remove(5);
		System.out.println("Array		삭제 후: " + Arrays.toString(array));
		System.out.println("ArrayList	삭제 후: " + list); // ArrayList 전체 출력
		
		// 모든 데이터 삭제 : 명.clear()
		for (int i = 0; i < array.length; i++) {
			array[i] = "";
		}
		
		list.clear();
		System.out.println("Array     전체 삭제 후: " + Arrays.toString(array));
		System.out.println("ArrayList 전체 삭제 후: " + list); // ArrayList 전체 출력
	}
}

/* 실행 결과
 * --------------------------------------------
 * * Array와 ArrayList의 크기
 * --------------------------------------------
 * 저장 전 array length: 10
 * 저장 전 ArrayList size: 0
 * 저장 후 array length: 10
 * 저장 후 ArrayList size: 4
 * --------------------------------------------
 * * Array와 ArrayList에 저장된 내용
 * --------------------------------------------
 * Array:		One Two Three Four null null null null null null 
 * ArrayList:	One Two Three four 
 * --------------------------------------------
 * * Array와 ArrayList에 저장된 내용 삭제
 * --------------------------------------------
 * Array		삭제 후: [One, Two, , Four, null, null, null, null, null, null]
 * ArrayList	삭제 후: [One, Two, four]
 * Array     전체 삭제 후: [, , , , , , , , , ]
 * ArrayList 전체 삭제 후: []
 */
