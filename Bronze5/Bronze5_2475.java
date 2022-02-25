import java.util.*;
import java.math.BigInteger;

public class Bronze5_2475 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = scanner.nextInt();
			a +=  n * n;
		}
		
		System.out.println(a%10);
		
	}

}
