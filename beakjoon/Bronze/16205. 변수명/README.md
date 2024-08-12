# [변수명](https://www.acmicpc.net/problem/16205)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 2 초 | 512 MB | 1127 | 580 | 517 | 55.413% |

## 문제

변수명을 정하는 표기법은 여러 가지가 있다.

- 카멜 표기법 (Camel Case): 각 단어의 첫 글자를 대문자로 적는다. 단, 가장 첫 글자는 소문자를 사용한다.
    - 예시: `camelCase`, `variableN`, `thisIsCamelCase`, `howToSolveThisProblem`
- 스네이크 표기법 (Snake Case): 소문자만 사용하고, 각 단어의 사이에 언더바(_)를 넣어서 적는다.
    - 예시: `snake_case`, `variable_n`, `this_is_snake_case`, `how_to_solve_this_problem`
- 파스칼 표기법 (Pascal Case): 카멜 표기법과 같지만, 가장 첫 글자도 대문자를 사용한다.
    - 예시: `PascalCase`, `VariableN`, `ThisIsPascalCase`, `HowToSolveThisProblem`

한 표기법을 사용한 변수명이 주어졌을 때, 이를 다른 표기법으로 변환하는 프로그램을 작성하시오.

## 입력

첫째 줄에 사용한 표기법의 번호와 변수명이 주어진다. 번호가 1인 경우는 카멜 표기법, 2인 경우는 스네이크 표기법, 3인 경우는 파스칼 표기법이다.

입력으로 주어지는 변수명의 길이는 100을 넘지 않는다.

카멜 표기법, 파스칼 표기법을 사용한 변수명은 알파벳 소문자와 대문자로만 이루어져 있고, 스네이크 표기법을 사용한 변수명은 알파벳 소문자와 언더바(_)로만 이루어져 있다. 또, 스네이크 표기법을 사용한 변수명의 첫 글자와 마지막 글자는 언더바가 아니고, 언더바가 연속해서 두 개 이상 사용하는 경우는 없다.

## 출력

첫째 줄에 카멜 표기법을 사용한 경우, 둘째 줄에 스네이크 표기법을 사용한 경우, 셋째 줄에 파스칼 표기법을 사용한 경우를 출력한다.

## 예제 입력 1

```
2 variable_n

```

## 예제 출력 1

```
variableN
variable_n
VariableN

```

## 예제 입력 2

```
1 camelCase

```

## 예제 출력 2

```
camelCase
camel_case
CamelCase

```

## 예제 입력 3

```
3 HowToSolveThisProblem

```

## 예제 출력 3

```
howToSolveThisProblem
how_to_solve_this_problem
HowToSolveThisProblem

```

## 예제 입력 4

```
2 good

```

## 예제 출력 4

```
good
good
Good
```
