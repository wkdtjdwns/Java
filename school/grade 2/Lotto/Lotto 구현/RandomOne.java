package test0000;

import java.util.Scanner;

public class RandomOne {

	public static void main(String[] args) {
		
		int luckyNum;
        int[] arrNum = new int[100];
        int[] arrOk = new int[6];
        int[] counts = new int[46];

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("좋아하는 숫자를 입력하시오 (1 ~ 9)");
            luckyNum = sc.nextInt();

            if (luckyNum >= 1 && luckyNum <= 9) {
                break;
            }
            
            else {
                System.out.println("숫자가 잘못되었습니다. 다시 입력해주세요.");
            }
        }

        sc.close();
        
        for (int i = 0; i < arrNum.length; i++) {
        	// 1 ~ 45의 정수 중의 난수를 전체 숫자 배열에 할당함.
            arrNum[i] = (int) (Math.random() * 45 + 1);
            counts[arrNum[i]]++;
        }

        int[] uNums = new int[45];
        int uCount = 0;

        for (int i = 0; i < arrNum.length && uCount < 6; i++) {
            boolean isUnique = true; // 중복이 없는지 확인 하기 위한 boolean 변수
            
            for (int j = 0; j < uCount; j++) {
            	// 만약 중복이 있다면 중복이 있다고 알려준 뒤에 해당 for문을 나감
                if (arrNum[i] == uNums[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            // 만약 중복이 없다면 값을 할당한 다음에 uCount++
            if (isUnique) {
                uNums[uCount++] = arrNum[i];
            }
        }

        // 위에서 중복을 제거한 값들을 실제로 출력할 배열에 할당함.
        for (int i = 0; i < arrOk.length; i++) {
            arrOk[i] = uNums[i];
        }

        // 해당 배열을 버블 정렬 한 뒤에 출력함.
        bubbleSort(arrOk);

        for (int num : arrOk) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\n숫자 분배 :");
        for (int i = 1; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }

	// 로또 번호 배열을 "버블 정렬"하는 메서드
    public static void bubbleSort(int[] array) {
        boolean swap; // 스왑이 되었는지 안 되었는지 확인할 수 있한 boolean 변수
        
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            
            for (int j = 0; j < array.length - 1 - i; j++) {
            	
            	// 버블 정렬 코드
                if (array[j] > array[j + 1]) {
                	
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    // 스왑이 되었다는 것을 알려줌.
                    swap = true;
                }
            }
            
            // 스왑이 안 되었다면 반복문 중지 (다른 연산을 굳이 할 필요가 없음.)
            if (!swap) break;
        }
	}
}

/*
실행 결과
---------------------------------
좋아하는 숫자를 입력하시오 (1 ~ 9)
5
7 11 16 17 35 40 

숫자 분배 :
1: 0
2: 1
3: 0
4: 2
5: 4
6: 1
7: 7
8: 2
9: 4
10: 3
11: 3
12: 2
13: 3
14: 1
15: 1
16: 2
17: 2
18: 1
19: 4
20: 0
21: 3
22: 3
23: 2
24: 2
25: 1
26: 4
27: 0
28: 1
29: 0
30: 0
31: 2
32: 0
33: 3
34: 2
35: 2
36: 7
37: 4
38: 0
39: 3
40: 4
41: 1
42: 3
43: 6
44: 1
45: 3

*/
