
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Scanner 객체를 사용하여 사용자 입력을 받음
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력할 문자열의 수를 입력받음
		int num = sc.nextInt();
		sc.nextLine(); // 개행 문자 처리

		// 입력받은 문자열을 저장할 ArrayList 생성
		ArrayList<String> strlist = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			strlist.add(sc.nextLine());
		}

		// 그룹 단어의 개수를 세는 변수
		int ans = 0;

		// 입력된 문자열 리스트를 순회
		for (String word : strlist) {
			if (isGroupWord(word)) {
				ans++;
			}
		}

		// 그룹 단어의 개수를 출력
		System.out.println(ans);

		// Scanner 객체를 닫음
		sc.close();
	}

	// 주어진 단어가 그룹 단어인지 판단하는 함수
	public static boolean isGroupWord(String word) {
		boolean[] seen = new boolean[26]; // 알파벳 26글자 체크 배열
		char prevChar = '0'; // 이전 문자를 저장할 변수

		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);

			// 현재 문자가 이전 문자와 같지 않다면
			if (currentChar != prevChar) {
				// 이미 본 문자가 다시 나오면 그룹 단어가 아님
				if (seen[currentChar - 'a']) {
					return false;
				}

				// 현재 문자를 본 것으로 체크
                // 'a'의 ASCII 값은 97, 'b'는 98, ... , 'z'는 122입니다.
                // 'currentChar - 'a''는 해당 문자를 배열 인덱스로 변환합니다.
                // 예를 들어, currentChar가 'b'라면, 'b' - 'a' = 1이 되어 seen[1]을 true로 설정합니다.
                // 즉, seen 배열의 각 인덱스는 알파벳 'a'부터 'z'까지 각각의 문자가 등장했는지를 나타냅니다.
				seen[currentChar - 'a'] = true;

				// prevChar를 현재 문자로 업데이트하여 다음 문자와 비교할 수 있도록 합니다.
				prevChar = currentChar;
			}
		}

		return true;
	}
}
