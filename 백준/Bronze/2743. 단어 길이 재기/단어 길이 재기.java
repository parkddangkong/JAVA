import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사용자로부터 문자열 입력을 받음
		String str = sc.nextLine(); 

		// 입력받은 문자열의 길이를 계산
		int strsize = str.length();
		
		// 문자열의 길이를 출력
		System.out.println(strsize);

		// Scanner 객체 닫기
		sc.close();
	}
}
