
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
            // 사용자로부터 두 개의 정수를 입력받음
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // 두 개의 정수가 모두 0이면 루프를 종료
            if (num1 == 0 && num2 == 0) {
                break;
            }

            // 두 정수의 합을 계산하여 ans에 저장
            int ans = num1 + num2;

            // 계산된 합을 리스트에 추가
            list.add(ans);
        }

        // 각 합계의 값을 출력하기 위한 변수 numans 선언
        int numans = 0;

        // 리스트의 모든 요소를 순회하며 출력
        for (int j = 0; j < list.size(); j++) {
            // 리스트의 j번째 요소를 numans에 저장
            numans = list.get(j);
            // numans 값을 출력
            System.out.println(numans);
        }
        
        // Scanner를 닫아줌
        sc.close();
    }
}
