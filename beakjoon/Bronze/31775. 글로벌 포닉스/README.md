# [글로벌 포닉스](https://www.acmicpc.net/problem/31775)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 1024 MB | 1338 | 745 | 678 | 58.600% |

## 문제

모두가 알다시피, 포닉스는 ***인류의 삶에 기여하는 가치창출대학*** 포스텍을 대표하는 마스코트이다! 포닉스는 오늘도 **GLOBAL**하고 새로운 가치를 창출하기 위해 노력하고 있다.

컴퓨터 과학 분야에서, **GLOBAL**한 가치란 단언컨대 ICPC World Finals 진출이다. 포닉스는 포스텍의 ICPC World Finals 진출을 위한 응원 문구를 만들려 한다. 응원 문구는 문자열 세 개로 이루어져 있다. 포닉스의 빅데이터 연구 결과, 세 문자열이 순서와 관계없이 각각 `l`, `k`, `p`로 시작할 경우 포스텍은 ICPC World Finals에 진출할 수 있다. 포닉스는 이러한 응원 문구를 **GLOBAL**한 문구로 부르기로 했다.

포닉스가 정한 세 개의 문자열이 주어질 때, 응원 문구가 **GLOBAL**한지 판단하여라.

## 입력

첫 번째 줄부터 3$3$개의 줄에 걸쳐 문자열 𝑆1, 𝑆2, 𝑆3이 주어진다.

모든 문자열은 알파벳 소문자 또는 숫자로 이루어진 길이 20 이하의 문자열이다.

## 출력

세 문자열으로 만든 응원 문구가 **GLOBAL**하면 `GLOBAL`을, 아니면 `PONIX`를 출력한다.

## 예제 입력 1

```
korea
legend
postech

```

## 예제 출력 1

```
GLOBAL

```

## 예제 입력 2

```
turing
dijkstra
neumann

```

## 예제 출력 2

```
PONIX

```

## 예제 입력 3

```
leo020630
kwoncycle
petamingks

```

## 예제 출력 3

```
GLOBAL
```
