import java.util.*;

public class Bronze4_2530 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int second = scanner.nextInt();
		int x = scanner.nextInt();
		
		
		int answer = second + x;
		
		if(answer >= 60) {
			for(;;) {
				answer = answer - 60;
				minute = minute + 1;
				if(minute == 60) {
					minute = 0;
					hour = hour + 1;
				}
				if (hour == 24) {
					hour = 0;
				}
				if(answer < 60) break;
					
			}
		}
		System.out.print(hour + " " + minute + " " + answer);
	}

}
