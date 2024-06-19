import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int ans = 0;
		
		if(num % 4 == 0) {
			if(num % 100 != 0 || num % 400 == 0) {
				ans = 1;
			}
		}
		
		System.out.println(ans);

		sc.close();

	}
}