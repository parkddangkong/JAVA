
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 처리할 숫자의 개수를 입력 받음
        int times = sc.nextInt();
        sc.nextLine();  // nextInt() 후에 남아있는 줄 바꿈 문자를 소비

        // 숫자 문자열을 입력 받음
        String num = sc.nextLine();
        
        // 문자열을 개별 문자로 분리
        String[] list = num.split("");
        
        int total = 0;
        
        // 입력된 숫자의 개수가 times와 같을 경우에만 실행
        if (times == num.length()) {
            // 각 문자를 숫자로 변환하여 total에 더함
            for (int i = 0; num.length() > i; i++) {
                total += Integer.valueOf(list[i]);
            }
        }
        
        // 총합을 출력
        System.out.println(total);

        sc.close();
    }
}


//  total += (int) num.charAt(i); -> 이러면 아스키 코드로 출력됨
