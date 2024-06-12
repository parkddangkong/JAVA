import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		char sco = 'F';

		if (100 >= num && num >= 90) {
			sco = 'A';
		} else if (89 >= num && num >= 80) {
			sco = 'B';
		} else if (79 >= num && num >= 70) {
			sco = 'C';
		} else if (69 >= num && num >= 60) {
			sco = 'D';
		}
		
		System.out.println(sco);

		sc.close();

	}
}
