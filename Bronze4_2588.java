import java.util.*;

public class Bronze4_2588 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = b  / 100, x1 = b % 100;
		int y = x1 / 10, z = x1 % 10;
		int first, second, third = 0;
		
		first = z * a;
		second = y * a;
		third = x * a;
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(a * b);
		
	}

}
