# [홍익대학교](https://www.acmicpc.net/problem/16394)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 256 MB | 13632 | 11626 | 11196 | 86.030% |

## 문제

홍익대학교는 1946년에 개교하였다.

특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.

단, 홍익대학교는 없어지지 않는다고 가정한다.

문제는 C, C++, JAVA 또는 Python3을 이용하여 해결한다.

1. C
    1. 입력
        - scanf 사용
        - 정수 %d, 실수 %f, 문자열 %s 사용
        - scanf("%d", &var);
    2. 출력
        - 정수 %d, 실수 %f, 문자열 %s 사용
        - 예) printf("%d", var);
    3. 필수 라이브러리 stdio.h
2. C++
    1. 입력
        - cin 사용
        - 예) cin >> var;
    2. 출력
        - cout 사용
        - 예) cout << var;
    3. 필수 라이브러리 iostream
    4. 권장사항
        - using namespace std;
        - ios::sync_with_stdio(false);
        - cin.tie(NULL);
3. Java
    1. 입력
        - Scanner 사용
        - Scanner sc = new Scanner(System.in); 정수: sc.nextInt(); 실수: sc.nextDouble(); 문자열: sc.nextLine(); 또는 sc.next();
    2. 출력
        - System.out.println(var);
    3. 필수 라이브러리 java.util.Scanner

## 입력

입력으로 첫 줄에 특정 년도를 알리는 정수 N이 주어진다. 정수 N은 1,946 부터 1,000,000 사이의 값이다. (1,946 ≤ N ≤ 1,000,000)

## 출력

출력으로 홍익대학교의 개교 주년을 나타내는 정수를 출력한다.

## 예제 입력 1

```
2018

```

## 예제 출력 1

```
72
```
