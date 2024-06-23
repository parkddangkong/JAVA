import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 주사위 
		int num = sc.nextInt();
		int ans = 1;

		for(int i =1; i < 10;i++) {
			ans = num * i;
			System.out.println(num +" * "+ i + " = "+ ans );
		}

		sc.close();

	}
}
