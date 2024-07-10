package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {

        //Random random = new Random();

        // Random 클래스의 연산은 모두 seed 값을 가지고 특정 연산을 통해 랜덤한 값을 뿌리는 것임
        // 즉, seed 값을 정하면 랜덤이 아닌 고정된 값을 얻을 수 있음.
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt); // int 범위 내

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble: " + randomDouble); // 0.0d ~ 1.0d

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean); // true & false

        // 범위 좁히기
        int randomRange1 = random.nextInt(10); // 0 ~ 9
        System.out.println("randomRange1: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1 ~ 10
        System.out.println("randomRange1: " + randomRange2);
    }
}

/*
씨드 - Seed
- Random은 내부에서 Seed 값을 사용해서 랜덤한 값을 구함.
- 그런데 이 Seed 값이 같으면 항상 같은 결과가 출력됨.
- new Random(): 생성자를 비워두면 내부에서 System.nanoTime()에 여러가지 복잡한 알고리즘을 섞어서 Seed 값을 생성함.
    - 따라서 반복 실행해도 결과가 항상 달라짐.

- new Random(int seed): 생성자에 Seed 값을 직접 전달할 수 있음. Seed 값이 같으면 여러번 반복 실행해도 실행 결과가 같음.
    - 하지만 결과가 고정되기 때문에 테스트 코드 같은 곳에서 결은 결과를 검증할 때 사용하곤 함.
    - 참고로 마인크래프트 같은 게임은 게임을 시작할 때 지형을 랜덤으로 생성하는데, 같은 Seed 값을 설정하면 같은 지형을 생성할 수 있음.
*/
