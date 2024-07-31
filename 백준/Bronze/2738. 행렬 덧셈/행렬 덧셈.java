import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Scanner 객체를 사용하여 사용자 입력을 받음
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int column = sc.nextInt();

		int[][] rowcolumn1 = new int[row][column];
		for (int i = 0; row > i; i++) {
			for (int j = 0; column > j; j++) {
				rowcolumn1[i][j] = sc.nextInt();
			}
		}

		int[][] rowcolumn2 = new int[row][column];
		for (int i = 0; row > i; i++) {
			for (int j = 0; column > j; j++) {
				rowcolumn2[i][j] = sc.nextInt();
			}
		}

		int[][] rowcolumnans = new int[row][column];
		for (int i = 0; row > i; i++) {
			for (int j = 0; column > j; j++) {
				rowcolumnans[i][j] = rowcolumn1[i][j] + rowcolumn2[i][j];
			}
		}

		for (int i = 0; row > i; i++) {
			for (int j = 0; column > j; j++) {
					System.out.print(rowcolumnans[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
