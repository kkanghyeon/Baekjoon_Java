import java.util.*;

public class Bronze4_2420 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int answer = 0;
		
		if(a == b && b == c) {
			answer = 10000 + a *1000;
		}
		else if(a == b || a == c || b == c) {
			if(a == b) {
				answer = 1000 + a * 100; 
			}
			else if (a == c) {
				answer = 1000 + a * 100;
			}
			else {
				answer = 1000 + b * 100;
			}
		}
		else {
			if(a > b && a > c) {
				answer = a * 100;
			}
			else if(b > a && b > c) {
				answer = b * 100;
			}
			else {
				answer = c * 100;
			}
		}
		System.out.println(answer);
	}

}
