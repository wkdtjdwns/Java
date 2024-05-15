# [가희와 방어율 무시](https://www.acmicpc.net/problem/25238)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 512 MB | 9011 | 4516 | 4206 | 50.951% |

## 문제

메이플스토리 몬스터는 방어율 수치가 있습니다. 이 방어율 수치의 일정 %를 무시하는 것을 방무라고 합니다. 유저는 아이템을 사거나, 특정한 스킬 레벨을 올려서 방무 수치를 올릴 수 있습니다. 그렇게 해서, 유저가 체감하는 몬스터의 방어율 수치를 낮출 수 있습니다. 몬스터의 방어율이 200이고, 유저의 방무가 20이라면, 몬스터의 방어율 200의 20%를 무시하게 되므로, 40만큼 무시하게 됩니다. 즉, 160이 유저가 체감하는 방어율 수치가 됩니다.

유저가 체감하는 몬스터의 방어율 수치가 100보다 크거나 같으면 몬스터에게 대미지를 줄 수 없습니다. 몬스터의 방어율 수치를 *a*, 유저의 방무를 *b*라고 할 때, 유저가 몬스터에게 대미지를 줄 수 있는지 없는지 알려주세요.

## 입력

첫 번째 줄에 정수 *a*와 *b*가 공백으로 구분되어 주어집니다.

## 출력

몬스터에게 대미지를 줄 수 있으면 1, 그렇지 않으면 0을 출력해 주세요.

## 제한

- 0 ≤ *a* ≤ 500
- 0 ≤ *b* ≤ 100

## 예제 입력 1

```
200 20

```

## 예제 출력 1

```
0

```

유저가 체감하는 몬스터의 방어율은 200에서 200의 20%을 뺀 160입니다. 이는 100보다 크므로, 유저는 몬스터에게 데미지를 줄 수 없습니다.

## 예제 입력 2

```
90 0

```

## 예제 출력 2

```
1

```

몬스터의 방어율이 90입니다. 이는 100보다 작으므로, 유저의 방무가 0이여도 몬스터에게 데미지를 줄 수 있습니다.

## 예제 입력 3

```
336 71

```

## 예제 출력 3

```
1

```

유저가 체감하는 몬스터의 방어율은 336에서 336의 71%인 238.56을 뺀 97.44입니다. 이는 100보다 작으므로, 유저는 몬스터에게 데미지를 줄 수 있습니다.

## 풀이

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int defense = Integer.parseInt(st.nextToken());
		int armor_pen = Integer.parseInt(st.nextToken());
		double tmp = defense - defense * (1d * armor_pen / 100);
		System.out.println(tmp >= 100 ? 0 : 1);
	}
	public static void main(String[] args) throws Exception {
		
		new Main().solution();
	}
}
```
