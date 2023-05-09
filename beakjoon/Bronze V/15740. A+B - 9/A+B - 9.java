import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
  
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] input = br.readLine().split(" ");
	        BigInteger a = new BigInteger(input[0]);
	        BigInteger b = new BigInteger(input[1]);
	        System.out.println(a.add(b).toString());
	}
}
