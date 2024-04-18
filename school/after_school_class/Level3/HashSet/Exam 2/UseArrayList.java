package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HashSetEx02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int numbers[] = new int[N];

        for (int i = 0; i < N; i++) numbers[i] = sc.nextInt();

        System.out.println(solution(numbers));
    }

    // solution 메소드 생성하고 구현
    public static ArrayList solution(int[] numbers)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length; j++)
            {
                if (i != j) {
                    if (!list.contains(numbers[i] + numbers[j])) list.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
