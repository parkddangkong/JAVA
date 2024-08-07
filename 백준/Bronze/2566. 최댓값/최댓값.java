import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        // 입력 받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 최댓값 및 위치 찾기
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i; // 0-based index
                    maxCol = j; // 0-based index
                }
            }
        }

        // 결과 출력
        System.out.println(max);
        System.out.println((maxRow + 1) + " " + (maxCol + 1)); // 1-based index

        sc.close();
    }
}