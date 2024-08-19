# [가지 한 두름 주세요](https://www.acmicpc.net/problem/31628)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 0.25 초 | 1024 MB | 1180 | 723 | 676 | 65.504% |

## 문제

10×10 격자의 각 칸에 가지가 한 개씩 들어 있습니다. 키위새는 가로로 연속한 10개의 칸 혹은 세로로 연속한 10개의 칸에 들어 있는 모든 가지를 단 한 번 줄줄이 연결할 수 있습니다. 가지 한 두름은 같은 색의 가지를 정확히 10개 연결한 것입니다. 각 칸에 들어 있는 가지의 색이 주어질 때, 키위새가 가지 한 두름을 만들 수 있는지 판단해 봅시다.

![image](https://upload.acmicpc.net/cdfb0b0a-9951-4a0b-8e99-5c7d4581cbe0/-/preview/)

첫 행의 모든 가지로 가지 한 두름을 만든 모습

## 입력

첫 번째 줄부터 10개 줄 각각에 각 행에 들어 있는 가지 10개의 색을 나타내는 문자열이 공백으로 구분되어 주어집니다. 그중 r번째 줄의 c번째 문자열은 r행 c열에 위치한 가지의 색을 나타냅니다. 가지의 색은 영어 소문자로만 이루어진 길이 1 이상 8 이하의 문자열입니다.

## 출력

키위새가 가지 한 두름을 만들 수 있으면 `1`을, 만들 수 없으면 `0`을 출력합니다.

## 예제 입력 1

```
r r r r r r r r r r
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b
g b g b g b g b g b

```

## 예제 출력 1

```
1

```

## 예제 입력 2

```
r b g b g b g b g b
r g b g b g b g b g
r b g b g b g b g b
r g b g b g b g b g
r b g b g b g b g b
r g b g b g b g b g
r b g b g b g b g b
r g b g b g b g b g
r b g b g b g b g b
r g b g b g b g b g

```

## 예제 출력 2

```
1

```

## 예제 입력 3

```
chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi
chipi chapa chipi chapa chipi chapa chipi chapa chipi chapa
chapa chipi chapa chipi chapa chipi chapa chipi chapa chipi

```

## 예제 출력 3

```
0
```
