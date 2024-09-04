import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] numlist = new String[5][15];

		// 입력받은 문장의 리스트
		String[] exlist = new String[15];
		for (int i = 0; numlist.length > i; i++) {
			exlist[i] = sc.nextLine();
		}

		// 입력받은 문장의 리스트들의 글자를 이중배열 안으로 삽입
		for (int i = 0; i < numlist.length; i++) {
			int num = 0; // exlist에서 사용할 문자 인덱스
			for (int j = 0; j < numlist[i].length && num < exlist[i].length(); j++) { // 이중 배열을 받을 때 구조
				numlist[i][j] = String.valueOf(exlist[i].charAt(num));
				num++;
			}
		}

		// 배열의 내용을 출력하기 위한 문자열 생성
		StringBuilder result = new StringBuilder();

		// 열 단위로 순회하여 각 열의 문자들을 결과 문자열에 추가
		for (int j = 0; j < numlist[0].length; j++) {
			for (int i = 0; i < numlist.length; i++) {
				if (j < numlist[i].length && numlist[i][j] != null) {
					result.append(numlist[i][j]);
				}
			}
		}
		
		
		 // 최종 결과 출력
        System.out.println(result.toString());

		sc.close();

	}

}