import java.util.*;

public class Bronze5_3003{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int basic[] = {1, 1, 2, 2, 2, 8};
		int old[] = new int[6];
		int answer[] = new int[6];
		
		for(int i = 0; i < 6; i++) {
			old[i] = scanner.nextInt();
		}
		

		for(int i = 0; i < 6; i++) {
			answer[i] = basic[i] - old[i];
		}		
		
		for(int i = 0; i < 6; i++) {
			System.out.print(answer[i]+ " ");
		}
	}

}
