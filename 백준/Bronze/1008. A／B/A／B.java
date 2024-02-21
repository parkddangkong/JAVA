import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double answer = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (0 < A && B < 10) {

			answer = (double)A / B;

		}
		System.out.println(answer);

	}

}