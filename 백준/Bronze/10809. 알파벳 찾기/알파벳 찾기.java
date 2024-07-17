
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 알파벳 배열 선언
        String[] alphalist = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        // 입력 받은 문자열
        String str = sc.nextLine();

        // 결과를 저장할 배열 초기화
        int[] anslist = new int[26]; // 알파벳 수(26)만큼 배열 초기화, 기본값은 0

        // 각 알파벳의 처음 등장 위치를 저장 (-1로 초기화)
        for (int i = 0; i < 26; i++) {
            anslist[i] = -1;
        }

        // 문자열을 순회하면서 각 알파벳이 처음 등장하는 위치를 기록
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a'; // 알파벳 'a'부터의 인덱스 계산
            if (anslist[idx] == -1) { // 해당 알파벳이 처음 등장하는 경우에만 위치 기록
                anslist[idx] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(anslist[i] + " ");
        }

        sc.close();
    }
}
