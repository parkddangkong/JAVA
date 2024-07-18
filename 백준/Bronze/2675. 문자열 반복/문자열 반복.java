import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스의 개수
        
        // 각 테스트 케이스에 대해 반복
        for (int t = 0; t < T; t++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 문자열 S
            
            // 문자열 S의 각 문자에 대해 반복 횟수 R만큼 반복하여 출력
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                for (int j = 0; j < R; j++) {
                    System.out.print(ch);
                }
            }
            
            System.out.println(); // 각 테스트 케이스의 결과를 한 줄로 출력하기 위한 줄바꿈
        }
        
        sc.close();
    }
}
