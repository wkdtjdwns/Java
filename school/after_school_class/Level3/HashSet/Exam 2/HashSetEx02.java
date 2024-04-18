package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int numbers[] = new int[N];

        for (int i = 0; i < N; i++) numbers[i] = sc.nextInt();

        solution(numbers);
    }

    // solution 메소드 생성하고 구현
    public static void solution(int[] numbers)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // 출력
        // System.out.println(set); -> [2, 3, 4, 5, 6, 7]

        Iterator iter = set.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " "); // -> 2 3 4 5 6 7

        System.out.println();

        // HashSet을 배열로 바꾸기
        int[] newNums = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        for (int n : newNums)
            System.out.print(n + " ");
    }
}
