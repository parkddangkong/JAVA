import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 입력: B진법 수 N을 문자열로 입력받습니다.
        String N = scanner.next();
        // 두 번째 입력: 진법 B를 정수로 입력받습니다.
        int B = scanner.nextInt();
        // Scanner 객체를 닫아줍니다.
        scanner.close();
        
        // 결과를 저장할 변수입니다. 결과는 10진법으로 변환된 값입니다.
        long result = 0;
        // N의 길이를 가져옵니다.
        int length = N.length();
        
        // N의 각 자리를 오른쪽에서 왼쪽으로 순회합니다.
        for (int i = 0; i < length; i++) {
            // N에서 오른쪽에서 i번째 문자를 가져옵니다.
            char digit = N.charAt(length - 1 - i);
            int value;
            
            // 문자가 숫자인 경우
            if (Character.isDigit(digit)) {
                // '0'의 ASCII 코드 값을 빼서 0~9의 숫자로 변환합니다.
                value = digit - '0';
            } else {
                // 문자가 알파벳인 경우 (A-Z)
                // 'A'의 ASCII 코드 값을 빼고 10을 더하여 10~35의 값을 계산합니다.
                value = digit - 'A' + 10;
            }
            
            // 각 자리의 값을 10진법으로 변환하여 결과에 추가합니다.
            // Math.pow(B, i)는 B의 i제곱을 계산합니다.
            result += value * Math.pow(B, i);
        }
        
        // 최종 결과를 출력합니다.
        System.out.println(result);
    }
}
