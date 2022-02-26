import java.util.*;

public class Bronze4_1297 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int diagnol = scanner.nextInt();
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		
		int x = height * height + width * width;
		
		double result = Math.sqrt(x);
		
		System.out.print((int)(height * (diagnol / result)) + " " + (int)(width * (diagnol / result)));
		
	}

}
