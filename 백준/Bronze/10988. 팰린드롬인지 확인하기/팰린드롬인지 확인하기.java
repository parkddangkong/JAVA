import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner sc = new Scanner(System.in);

        // 사용자가 입력한 문자열을 읽음
        String str = sc.nextLine();
        // 뒤집어진 문자열을 저장할 변수
        String endstr = "";

        // 입력 문자열을 뒤에서부터 하나씩 endstr에 추가
        for (int i = str.length(); i > 0; i--) {
            endstr += str.charAt(i - 1);
        }

        // 입력 문자열과 뒤집어진 문자열이 같은지 비교
        if (str.equals(endstr)) {
            // 같으면 1을 출력 (회문인 경우)
            System.out.println("1");
        } else {
            // 다르면 0을 출력 (회문이 아닌 경우)
            System.out.println("0");
        }

        // Scanner 객체를 닫아줌
        sc.close();
    }
}