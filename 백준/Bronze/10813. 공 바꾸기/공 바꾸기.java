import java.util.ArrayList; 
import java.util.Scanner;  

public class Main { 
	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in); 

		int buket = sc.nextInt(); // 사용자가 입력한 정수를 읽어 buket 변수에 저장합니다.
		int ballchainge = sc.nextInt(); // 사용자가 입력한 정수를 읽어 ballchainge 변수에 저장합니다.

		// buket 크기의 ArrayList 객체를 생성합니다.
		ArrayList<Integer> buketlist = new ArrayList<Integer>(buket);

		// buket 개수만큼 1부터 시작하는 숫자를 리스트에 추가합니다.
		for (int i = 1; buket >= i; i++) {
			buketlist.add(i);
		}

		// ballchainge 횟수만큼 두 위치의 값을 교환합니다.
		for (int i = 0; ballchainge > i; i++) {
			int num1 = sc.nextInt() - 1; // 교환할 첫 번째 인덱스를 입력받습니다.
			int num2 = sc.nextInt() - 1; // 교환할 두 번째 인덱스를 입력받습니다.

			// 두 인덱스의 값을 저장합니다.
			int num1index = buketlist.get(num1);
			int num2index = buketlist.get(num2);

			// 두 인덱스의 값을 교환합니다.
			buketlist.set(num1, num2index);
			buketlist.set(num2, num1index);
		}

		// buketlist의 최종 상태를 출력합니다.
		for(int i = 0; buketlist.size() > i; i++) {
			System.out.print(buketlist.get(i) + " ");
		}

		sc.close();
	}
}
