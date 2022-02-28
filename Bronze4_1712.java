import java.util.*;

public class Bronze4_1712 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int y = c - b;
		long i = 1;

		if(b >= c) {
			System.out.println("-1");
		}
		else {
			for(;;) {
				long x = y * i;
				if(x > a) {
					System.out.println(i);
					break;
				} 
				i++;
			}
		}
	}

}
