

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int H = sc.nextInt();
	        int M = sc.nextInt();
	        int C = sc.nextInt();

	        // 요리 시간 더하기
	        M += C;

	        // 분이 60 이상이면 시간 증가
	        if (M >= 60) {
	            H += M / 60;
	            M = M % 60;
	        }

	        // 시간이 24 이상이면 24로 나눈 나머지로 변경
	        if (H >= 24) {
	            H = H % 24;
	        }

	        System.out.print(H + " ");
	        System.out.print(M);


		sc.close();

	}
}
