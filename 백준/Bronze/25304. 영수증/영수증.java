import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 가격이랑 물건의 종류 수를 입력 받음
		int tprice = sc.nextInt();
		int tkind = sc.nextInt();
		
		// 물건의 총 토탈 합계를 받기 위한 변수
		int total = 0;
		int object = 1;
		
		for(int i = 1; i <= tkind; i++) {
			int price = sc.nextInt();
			int kind = sc.nextInt();
			
			object = price * kind;
			total += object;
		}
		
		if(tprice == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		sc.close();

	}
}
