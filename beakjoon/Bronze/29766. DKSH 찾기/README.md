# [DKSH 찾기](https://www.acmicpc.net/problem/29766)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 1024 MB | 1764 | 1189 | 1129 | 69.349% |

## 문제

![image](https://upload.acmicpc.net/2b37369e-1aaf-47a9-8250-8cee10eca7eb/-/crop/4500x2026/0,1150/-/preview/)

학교의 로고인 DKSH는 Dankook University Software High School의 약자이다.

`D`, `K`, `S`, `H`로만 이루어진 문자열이 주어진다. 이 문자열에서 `DKSH`가 몇 번 나타나는지 구해보자.

## 입력

첫째 줄에 문자열이 입력된다. 문자열의 길이는 1000$1\,000$을 넘지 않는다.

## 출력

첫째 줄에 입력된 문자열에서 `DKSH`가 몇 번 나타나는지 출력한다.

## 예제 입력 1

```
DKKSSH

```

## 예제 출력 1

```
0

```

DKKSSH에는 DKSH가 나타나지 않는다.

## 예제 입력 2

```
HDKSHDDKS

```

## 예제 출력 2

```
1

```

H**DKSH**DDKS로 DKSH가 1번 나타난다.

## 예제 입력 3

```
SDKSHSSDKSHS

```

## 예제 출력 3

```
2

```

S**DKSH**SS**DKSH**S로 DKSH가 2번 나타난다.
