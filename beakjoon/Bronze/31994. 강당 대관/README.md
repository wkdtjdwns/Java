# [강당 대관](https://www.acmicpc.net/problem/31994)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 1024 MB | 591 | 480 | 454 | 83.456% |

## 문제

한국정보기술진흥원에서는 다양한 세미나가 열린다.

전문가를 위한 알고리즘, 데이터분석, 인공지능, 사이버보안, 네트워크 세미나뿐만 아니라 예비 창업가를 위한 창업 세미나, 그리고 청소년들을 위한 입시 세미나가 열린다

| 세미나 |
| --- |
| Algorithm |
| DataAnalysis |
| ArtificialIntelligence |
| CyberSecurity |
| Network |
| Startup |
| TestStrategy |

오늘은 위 7개 주제의 세미나가 모두 열리는 날이다. 가장 많은 신청자 수를 가진 세미나에게 대강당을 대관해준다고 할 때, 대강당을 사용하는 세미나의 이름을 구하자.

## 입력

7줄에 걸쳐서 세미나의 이름과 신청자 수가 공백으로 구분되어 주어진다.

세미나는 지문의 표에 있는 7개이며, 중복 되는 세미나는 주어지지 않는다.

신청자 수는 1 이상 100 이하의 정수로만 주어지며, 신청자 수는 중복으로 주어지지 않는다.

## 출력

첫 번째 줄에 대강당을 사용하는 세미나의 이름을 출력한다.

## 예제 입력 1

```
Network 75
ArtificialIntelligence 93
Startup 5
CyberSecurity 47
TestStrategy 42
Algorithm 74
DataAnalysis 65

```

## 예제 출력 1

```
ArtificialIntelligence
```
