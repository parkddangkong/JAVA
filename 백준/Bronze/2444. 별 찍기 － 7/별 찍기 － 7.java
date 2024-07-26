import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 사용자로부터 숫자 입력 받기
        int num = sc.nextInt();
        int num2 = num;
        int numans1 = 2 * num - 1;
        int numans2 = 2 * num - 1;

        // 출력할 문자열 초기화
        String star = "*";
        String plus = "**";
        String emty = " ";

        // 윗 부분 출력
        for (int i = 0; numans1 > i; i++) {
            for (int e = num - 1; e > 0; e--) {
                System.out.print(emty);  // 왼쪽 공백 출력
            }
            num -= 1;
            System.out.println(star);  // 별 출력
            if (star.length() == numans1) {
                break;  // 별의 길이가 조건에 맞으면 종료
            }
            star += plus;  // 별의 길이를 늘리기
        }

        int initialSpaces = 1;

        // 아래 부분 출력
        for (int k = num2 - 1; k > 0; k--) {
            for (int e = 0; e < initialSpaces; e++) {
                System.out.print(emty);  // 왼쪽 공백 출력
            }
            initialSpaces += 1;
            for (int j = 0; j < numans2 - 2; j++) {
                System.out.print("*");  // 별 출력
            }
            numans2 -= 2;
            System.out.println();  // 줄 바꿈
        }

        sc.close();  // 스캐너 닫기
    }
}
