
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 객체를 생성하여 사용자 입력을 받습니다.

        int buket = sc.nextInt(); // 바구니의 수 입력
        int ball = sc.nextInt(); // 공을 넣는 횟수 입력
        sc.nextLine(); // 개행 문자 제거
        
        // 바구니를 담을 ArrayList를 초기화합니다. 초기 크기는 buket으로 설정합니다.
        ArrayList<Integer> buketlist = new ArrayList<>(buket);
        for (int i = 0; i < buket; i++) {
            buketlist.add(0); // 모든 바구니를 0으로 초기화합니다.
        }
        
        // 공을 넣는 작업을 ball번 반복합니다.
        for (int i = 0; i < ball; i++) {
            int buket1 = sc.nextInt(); // 공을 넣을 시작 바구니 번호 입력
            int buket2 = sc.nextInt(); // 공을 넣을 마지막 바구니 번호 입력
            int ballnum = sc.nextInt(); // 넣을 공의 번호 입력
            sc.nextLine(); // 개행 문자 제거
            
            // 바구니 번호는 1부터 시작하지만 리스트 인덱스는 0부터 시작하므로 인덱스 조정이 필요합니다.
            // buket1과 buket2를 인덱스로 변환하여 해당 범위의 바구니에 ballnum을 설정합니다.
            for (int j = buket1 - 1; j < buket2; j++) {
                buketlist.set(j, ballnum);
            }
        }
        
        // 결과 출력: 각 바구니에 들어있는 공의 번호를 공백으로 구분하여 출력합니다.
        for (int i = 0; i < buketlist.size(); i++) {
            System.out.print(buketlist.get(i) + " ");
        }

        // 스캐너를 닫습니다.
        sc.close();
    }
}
