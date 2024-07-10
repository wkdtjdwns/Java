package solveExam.exam6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teacher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cost = new ArrayList<>();
        ArrayList<Integer> budget = new ArrayList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        long X = sc.nextInt();

        for (int i=0; i<N; i++) {
            cost.add(sc.nextInt());
        }

        for (int i=0; i<M; i++) {
            budget.add(sc.nextInt());
        }

        Collections.sort(cost);
        Collections.sort(budget);

        // 어짜피 동방이 없으면 동아리를 할당할 수 없음
        if (M > N) {
            // 그래서 돈이 가장 없는 동아리는 삭제함.
            for (int i=0; i<(M-N); i++) {
                budget.remove(0);
            }
        }

        int ans = 0;
        while (budget.size() > 0) {
            if ((calc(cost, budget)) <= X) {
                ans = budget.size();
                break;
            } else {
                budget.remove(0);
            }
        }
        System.out.println(ans);
    }

    static Long calc(ArrayList cost, ArrayList budget) {
        long need = 0;
        for (int i=0; i<budget.size(); i++) {
            need += ((int)budget.get(i) >= (int)cost.get(i)) ? 0 : ((int)cost.get(i) - (int)budget.get(i));
        }

        return need;
    }
}
