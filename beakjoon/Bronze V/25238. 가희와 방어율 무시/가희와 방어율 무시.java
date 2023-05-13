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
