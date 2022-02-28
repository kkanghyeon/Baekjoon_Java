import java.util.*;

public class Bronze4_2480 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		long answer = (long)n - m;
		
		if(answer < 0) {
			System.out.println(-answer);
		}
		else {
			System.out.println(answer);
		}
	}

}
