

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 전체 리스트 생성
        ArrayList<Integer> alllist = new ArrayList<Integer>();

        // 입력 리스트 생성
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 포함되지 않은 숫자 리스트 생성
        ArrayList<Integer> nolist = new ArrayList<Integer>();

        // 1부터 30까지의 숫자를 alllist에 추가
        for (int i = 1; i <= 30; i++) {
            alllist.add(i);
        }

        // 사용자로부터 28개의 숫자를 입력받아 list에 추가
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        // alllist의 각 요소가 list에 포함되지 않았을 경우 nolist에 추가
        for (int i = 0; i < alllist.size(); i++) {
            if (!list.contains(alllist.get(i))) {
                nolist.add(alllist.get(i));
            }
        }

        // 포함되지 않은 숫자 리스트 nolist 출력
        for(int no : nolist) {
        	System.out.println(no);
        }

        sc.close();
    }
}
