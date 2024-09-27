# [Penalty calculation](https://www.acmicpc.net/problem/10902)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 256 MB | 625 | 353 | 317 | 64.562% |

## 문제

제2회 kriiICPC의 페널티 계산 방식은 너무 복잡하다. 따라서 운영진은 여러분에게 페널티 계산을 맡기고자 한다.

당신이 어느 한 문제에 답안을 n개 제출했다고 하자. 이 중 i번째 (1 ≤ i ≤ n) 답안은 대회가 시작한 지 ti분 뒤에 제출하였고, 채점 결과 si점을 받았다고 가정하자.

이 문제에 대한 페널티 P는 다음과 같이 계산한다. 우선, max{s1, s2, ..., sn} = sk를 만족하는 가장 작은 k (즉, 가장 높은 점수를 받은 답안들 중 가장 빨리 제출한 것의 번호)를 f로 두자. 이제 P는 아래 공식을 이용하여 계산할 수 있다.

- sf= 0 : P = 0
- sf = 1 또는 sf = 4 : P = tf + (f - 1) × 20

당신이 어느 한 문제에 제출한 답안들의 정보가 주어질 때, 이 문제에서 받는 페널티를 계산하는 프로그램을 작성하라.

## 입력

첫 번째 줄에 이 문제에 제출한 답안의 수 n (1 ≤ n ≤ 100)이 주어진다.

이후 n개의 줄이 주어지는데, 이 중 i번째 (1 ≤ i ≤ n)번째 줄에는 두 개의 정수 ti와 si가 공백을 사이로 두고 주어진다. 1 ≤ t1 < t2 < ... < tn ≤ 300, 임이 보장된다.

## 출력

첫 번째 줄에 P의 값을 출력한다.

## 예제 입력 1

```
1
300 4

```

## 예제 출력 1

```
300

```

## 예제 입력 2

```
2
1 1
2 4

```

## 예제 출력 2

```
22

```

## 예제 입력 3

```
4
1 0
2 1
3 0
5 4

```

## 예제 출력 3

```
65

```

## 예제 입력 4

```
3
1 0
10 0
100 0

```

## 예제 출력 4

```
0
```