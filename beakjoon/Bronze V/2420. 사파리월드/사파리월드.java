import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long n = Long.parseLong(st.nextToken());
    long m = Long.parseLong(st.nextToken());
    System.out.println(Math.abs(n-m)); // 빼고 나서 절댓값 출력 -> 양수
    }
}
