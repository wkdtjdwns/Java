package hash;

import java.util.Scanner;

public class HashSetEx01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, target));
    }

    // solution 메소드를 생성하고 구현하시오.
    public static boolean solution(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;

                temp = arr[i] + arr[j];

                if (temp == target) return true;
            }
        }

        return false;
    }
}
