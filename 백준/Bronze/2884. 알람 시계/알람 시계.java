import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		int NM = 0;

		if (H < 24 && M < 60) {
			NM = M - 45;
			if (NM < 0) {
				H = H - 1;
				if (H < 0) {
					H = 23;
				}
				NM = 60 + NM;
			}
		}

		System.out.print(H + " ");
		System.out.print(NM);

		sc.close();

	}
}
