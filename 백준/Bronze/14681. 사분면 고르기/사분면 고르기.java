import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		
		if(x >= 0 && y >=0) {
			ans = 1;
		}
		else if(x <= 0 && y >= 0) {
			ans = 2;
		}
		else if(x <= 0 && y <= 0) {
			ans = 3;
		}
		else {
			ans = 4;
		}

		System.out.println(ans);
		sc.close();

	}
}
