import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 주사위 
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		
		// 변수(다이스 숫자, 답)
		int num = 0;
		int ans = 0;
		
		// 숫자 3개가 다 같을때
		if(dice1 == dice2 && dice2 == dice3) {
			ans = 10000 + dice1 * 1000;
		}
		
		//숫자 2개가 같을때 
		else if(dice1 == dice2 || dice1 == dice3) {
			num = dice1;
			ans = 1000 + num * 100; 
		}
		else if(dice2 == dice3) {
			num = dice3;
			ans = 1000 + num * 100; 
		}
		// 모든 수가 다를 때
		else {
			int big = dice1 > dice2 ? dice1 : dice2;
			big = big > dice3 ? big : dice3;
			ans = big * 100;
		}
		
		System.out.println(ans);
		

		sc.close();

	}
}