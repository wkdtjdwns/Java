# [스트릿 코딩 파이터](https://www.acmicpc.net/problem/23348)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 512 MB | 1983 | 1457 | 1302 | 77.917% |

## 문제

*대한민국 최고의 알고리즘 동아리를 찾기 위한 리얼리티 서바이벌. 잔혹한 코딩판에서 살아남기 위한 대학생들의 자존심을 건 생존 경쟁이 시작된다!*

스트릿 코딩 파이터는 최근 모임을 갖지 못하게 된 알고리즘 동아리들을 위해 방송사에서 제작한 특별 프로그램이다.

참가한 동아리들은 3인 1팀으로 팀을 구성해 각자 라이브로 문제를 풀고 심사를 받는다.

심사기준은 정답과 상관없이 **멋있게** 문제를 푸는 사람들이 유리한 점수를 가져가게 되는데, 이때 점수가 부여되는 공식적인 기술은 '한손 코딩', '노룩 코딩', '폰코딩'으로 총 3가지이고, 각 기술들에는 난이도가 다르게 부여된다.

![image](https://github.com/user-attachments/assets/490d8ca2-5e4e-4b6f-a049-40e8a7161989)

한손 코딩

![image](https://github.com/user-attachments/assets/68b98a9d-8626-4485-b7c2-9b2d6f21aee8)

노룩 코딩

![image](https://github.com/user-attachments/assets/c3d7447b-da00-441b-9c51-2cc87f77683e)

폰코딩

<예시>

심사 방식은 다음과 같다.

- 동아리의 총 점수는 구성원들의 개인 점수 합이다.
- 개인 점수는 세 가지 기술 점수의 합이다.
- 기술 점수는 해당 기술의 난이도와 사용한 횟수를 곱한 값이다.

예를 들어 '한손 코딩', '노룩 코딩', '폰코딩'의 난이도가 각각 3, 6, 9이며 플레이어 P$P$가 위 기술을 각각 1, 2, 3번 보여주었다면, P의 점수는 (3 × 1) + (6 × 2) + (9 × 3) = 42점이 된다.

기술의 난이도와 동아리 별 각 팀원들이 사용한 기술의 횟수가 주어진다. 가장 높은 점수를 받은 동아리의 점수는 몇 점인지 구하는 프로그램을 작성하시오.

## 입력

첫째 줄에 세 가지 기술의 난이도 A, B, C가 '한손 코딩', '노룩 코딩', '폰코딩' 순서대로 공백을 사이에 두고 주어진다. (0 ≤ A, B, C ≤ 1,000)

둘째 줄에 참가한 동아리의 수 N이 주어진다. (1 ≤ N ≤ 1,000)

셋째 줄부터 3N 개의 줄에 걸쳐 세 줄마다 각 동아리의 기술 사용 정보가 주어진다.

세 개의 줄에는 각 줄마다 동아리를 구성하는 각 동아리원이 사용한 기술의 횟수 a, b, c가 '한손 코딩', '노룩 코딩', '폰코딩' 순서대로 공백을 사이에 두고 주어진다. (0 ≤ a, b, c ≤ 100)

## 출력

첫째 줄에 가장 높은 점수를 받은 동아리의 점수를 출력한다.

## 예제 입력 1

```
3 6 9
2
1 2 3
1 1 1
2 2 2
0 0 0
0 1 0
3 3 3

```

## 예제 출력 1

```
96
```
