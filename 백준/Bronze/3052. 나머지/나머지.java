import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // ArrayList 객체 생성 - 사용자로부터 입력받은 숫자들을 저장하기 위해 사용
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 사용자로부터 10개의 정수를 입력받아 list에 추가
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
            sc.nextLine(); // 개행 문자를 소비하여 입력 버퍼를 정리
        }

        // HashSet 객체 생성 - list에서 42로 나눈 나머지 값을 저장하며, 중복을 자동으로 제거
        HashSet<Integer> numlist = new HashSet<Integer>();

        // list의 각 요소를 42로 나눈 나머지를 numlist에 추가
        for (int i = 0; i < list.size(); i++) {
            numlist.add(list.get(i) % 42);
        }

        // 고유한 나머지 값의 개수를 계산하기 위한 변수
        int ans = 0;

        // numlist의 크기만큼 반복하여 ans 증가 (numlist의 크기를 바로 사용할 수 있음)
        for (int i = 0; i < numlist.size(); i++) {
            ans++;
        }

        // 고유한 나머지 값의 개수를 출력
        System.out.println(ans);

        // Scanner 객체 닫기
        sc.close();
    }
}
