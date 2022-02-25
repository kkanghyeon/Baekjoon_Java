import java.util.*;
import java.math.BigInteger;

public class Bronze5_1271 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		
		System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
	}

}
