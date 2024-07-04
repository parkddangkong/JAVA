import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 함
        Scanner sc = new Scanner(System.in);

        // 정수 결과를 저장할 ArrayList를 생성
        List<Integer> list = new ArrayList<>();

        // 무한 루프 시작, 사용자가 종료 조건을 입력할 때까지 반복
        while (true) {
            // 사용자로부터 입력을 받아 줄 단위로 처리(trim()이 굳이 필요는 없지만 사용자의 실수를 방지하기 위함)
            if (!sc.hasNextLine()) {
                break;
            }
            
            String input = sc.nextLine().trim();

            // 입력이 빈 줄이면 루프 종료
            if (input.isEmpty()) {
                break;
            }

            // 입력을 공백 기준으로 나누어 두 정수로 변환
            String[] numbers = input.split(" ");
            
            if (numbers.length < 2) {
                System.out.println("두 개의 정수를 입력해주세요.");
                continue;
            }

            try {
                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);

                // 두 정수의 합을 계산하여 ans에 저장
                int ans = num1 + num2;

                // 계산된 합을 리스트에 추가
                list.add(ans);
            } catch (NumberFormatException e) {
                System.out.println("유효한 정수를 입력해주세요.");
            }
        }

        // 각 합계의 값을 출력
        for (int numans : list) {
            System.out.println(numans);
        }

        // Scanner를 닫아줌
        sc.close();
    }
}
