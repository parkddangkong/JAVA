
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자 입력을 받기 위해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 최종 결과값을 저장할 변수 초기화
        float ans = 0;

        // 시험 본 과목의 개수를 입력받음
        int time = sc.nextInt();
        sc.nextLine(); // nextInt() 후의 버퍼를 비우기 위해 사용

        // 현재 점수를 한 줄로 입력받음
        String score = sc.nextLine();
        
        // 점수를 공백으로 구분하여 문자열 배열로 변환
        String[] scorelist = score.split(" ");

        // 점수 문자열 배열을 정수형 리스트로 변환
        ArrayList<Integer> scorelist2 = new ArrayList<>();
        for (int i = 0; i < scorelist.length; i++) {
            scorelist2.add(Integer.valueOf(scorelist[i]));
        }

        // 변환된 점수를 저장할 리스트
        ArrayList<Float> agelist = new ArrayList<>();

        // 입력받은 과목 수와 점수 리스트의 크기가 같은지 확인
        if (time == scorelist2.size()) {
            // 모든 점수 중에서 최대값을 찾음
            int max = Collections.max(scorelist2);

            // 점수 변환: (현재 점수 / 최대 점수) * 100
            for (int i = 0; i < scorelist2.size(); i++) {
                float total = (float) scorelist2.get(i) / max * 100;
                agelist.add(total);
            }
        }

        // 변환된 점수의 합계를 구함
        float listtotal = 0;
        for (int i = 0; i < agelist.size(); i++) {
            listtotal += agelist.get(i);
        }

        // 최종 결과값을 계산: 합계 / 과목 수
        ans = listtotal / time;

        // 결과값을 소수점 이하 여섯 자리까지 출력
        System.out.printf("%f\n", ans);

        // Scanner 객체 닫기
        sc.close();
    }
}
