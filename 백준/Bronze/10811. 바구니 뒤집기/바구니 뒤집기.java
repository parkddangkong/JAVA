import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 객체 생성 - 사용자 입력을 받기 위해 사용
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 전체 버킷 수와 뒤집을 구간 수 입력받기
        int buket = sc.nextInt();  // 전체 버킷 수
        int rebuket = sc.nextInt();  // 뒤집을 구간 수
        int num = 1;  // 버킷에 채울 초기 값

        // ArrayList 객체 생성 - 1부터 buket까지의 숫자를 저장
        ArrayList<Integer> list = new ArrayList<Integer>();

        // buket 수만큼 숫자를 리스트에 추가
        for (int i = 0; i < buket; i++) {
            list.add(num);
            num++;
        }

        // 사용자로부터 뒤집을 구간을 입력받아 리스트의 해당 부분을 뒤집기
        for (int i = 0; i < rebuket; i++) {
            // 뒤집을 구간의 시작 인덱스와 끝 인덱스를 입력받기
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            // subList를 사용하여 부분 리스트 생성 (num1-1에서 num2까지)
            List<Integer> sub = list.subList(num1 - 1, num2);
            
            // 부분 리스트 뒤집기
            Collections.reverse(sub);
        }

        // 결과 리스트 출력
        for(int i = 0;list.size() > i;i++) {
        	System.out.print(list.get(i) + " ");
        }
        
        // Scanner 객체 닫기
        sc.close();
    }
}
