

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 스캐너 객체를 생성하여 사용자 입력을 받습니다.

        ArrayList<Integer> list = new ArrayList<Integer>(); // 정수를 저장할 ArrayList를 생성합니다.

        // 9개의 자연수를 입력받아 리스트에 추가합니다.
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt(); // 정수를 입력받습니다.
            list.add(num); // 입력받은 정수를 리스트에 추가합니다.
        }

        // 최대값과 그 최댓값이 몇 번째 수인지를 구합니다.
        int max = list.get(0); // 리스트의 첫 번째 요소를 최대값으로 초기화합니다.
        int index = 1; // 최대값의 인덱스를 1로 초기화합니다. (인덱스는 1부터 시작)

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) { // 현재 요소가 max보다 크면
                max = list.get(i); // max를 현재 요소로 갱신합니다.
                index = i + 1; // 최대값의 인덱스를 갱신합니다.
            }
        }

        System.out.println(max); // 최대값을 출력합니다.
        System.out.println(index); // 최대값의 인덱스를 출력합니다.

        // 스캐너를 닫습니다.
        sc.close();
    }
}
