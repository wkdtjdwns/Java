package arraylist.ArrayList01;

import java.util.Arrays;
import java.util.ArrayList;

public class Array01_v1_add_index {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		System.out.println("--------------------------------------------");
		System.out.println("* ArrayList에 저장된 내용");
		System.out.println("--------------------------------------------");
		
		System.out.print("ArrayList:	");
		for (String str : list) { // 데이터 전체 출력
			System.out.print(str + " ");
		}
		
		System.out.println("ArrayList size: " + list.size());
		// System.out.println(list); // ArrayList 전체 출력
		
		// 삽입할 위치(index) 섧정 후 등록 list.add(위치, 내용);
		list.add(0, "하나");
		list.add(2, "둘");
		list.add(4, "셋");
		list.add(6, "넷");
		
		System.out.print("ArrayList:	");
		for (String str : list) { // 데이터 전체 출력
			System.out.print(str + " ");
		}
		System.out.println("");
		System.out.println("전체 출력: " + list); // ArrayList 전체 출력
		System.out.println("ArrayList size: " + list.size());
	}
}

/* 실행 결과
 * --------------------------------------------
 * * ArrayList에 저장된 내용
 * --------------------------------------------
 * ArrayList:	One Two Three Four ArrayList size: 4
 * ArrayList:	하나 One 둘 Two 셋 Three 넷 Four
 * 전체 출력: [하나, One, 둘, Two, 셋, Three, 넷, Four]
 * ArrayList size: 8
 */
