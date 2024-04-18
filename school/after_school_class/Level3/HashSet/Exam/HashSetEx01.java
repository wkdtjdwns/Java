package hash;

import java.util.HashSet;
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

    public static boolean solution(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<Integer>();

        // a + b = target이라는 것은 결국
        // target - a = b를 말함.
        for (int i : arr) {

            // target - a = b를 찾는 로직 && 같은 숫자를 더하지 못하게 하는 로직
            if (set.contains(target - i) && target - i != i) return true;
            set.add(i);
        }

        return false;
    }
}
