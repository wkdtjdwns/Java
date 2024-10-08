# [아이그루스와 화장실 [스페셜 저지]](https://www.acmicpc.net/problem/30642)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 1024 MB | 1114 | 601 | 520 | 56.645% |

## 문제

IGRUS는 *Inha Group of Research for Unix Security*의 약자로, 2000년부터 시작된 정통처 산하 컴퓨터 학술 자치회이다. IGRUS의 동아리방은 사실 복층 구조로, 1층부터 N층까지 총 N개의 층이 있다. 홀수 층에는 몸집이 큰 동물을 위한 화장실이, 짝수 층에는 몸집이 작은 동물을 위한 화장실이 있다.

인하대학교의 마스코트 안뇽이는 용이고 인덕이는 오리다. 용은 몸집이 큰 동물이며, 오리는 몸집이 작은 동물이라고 하자. IGRUS 동방에 방문한 안뇽이와 인덕이를 위해 “(<안뇽이> or <인덕이>) 가 <K>층에 있을 때, 자신의 몸집에 맞는 가장 가까운 화장실은 몇 층일까?” 라는 질문에 답하는 프로그램을 만들어보자.

## 입력

첫째 줄에 IGRUS 동아리방의 층수 *N*이 주어진다.

둘째 줄에 화장실을 이용하려는 마스코트가 안뇽이라면 `annyong`이, 인덕이라면 `induck`이 주어진다.

셋째 줄에 해당 마스코트가 현재 있는 층 *K*가 주어진다.

## 출력

문제의 정답이 될 수 있는 정수를 하나 출력한다.

그런 정수가 여러가지라면 그 중 어떤 것을 출력해도 정답으로 인정된다.

## 제한

- 2 ≤ *N* ≤ 20,000
- 1 ≤ *K* ≤ *N*

## 예제 입력 1

```
5
annyong
4

```

## 예제 출력 1

```
5

```

안뇽이는 용이며, 용은 몸집이 큰 동물이므로 홀수 층의 화장실을 사용해야 한다.

4층에서 제일 가까운 홀수 층의 화장실은 3층과 5층이며, 따라서 정답이 될 수 있는 정수는 3과 5 두 가지이다.

예시 출력의 5 대신 3을 출력해도 정답으로 인정된다.

## 예제 입력 2

```
20
induck
8

```

## 예제 출력 2

```
8

```

인덕이는 오리이며, 오리는 몸집이 작은 동물이므로 짝수 층의 화장실을 사용해야 한다.

8층에서 제일 가까운 짝수 층의 화장실은 바로 8층이다.

따라서 8을 출력해야 정답으로 인정된다.
