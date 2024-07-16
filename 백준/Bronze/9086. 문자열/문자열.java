import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스의 개수를 입력 받음
        sc.nextLine(); // 개행 문자 처리
        
        for (int t = 0; t < T; t++) {
            String str = sc.nextLine(); // 한 줄의 문자열을 입력 받음
            char firstChar = str.charAt(0); // 첫 번째 문자
            char lastChar = str.charAt(str.length() - 1); // 마지막 문자
            System.out.println(firstChar + "" + lastChar); // 첫 글자와 마지막 글자를 연속하여 출력
        }
        
        sc.close();
    }
}
