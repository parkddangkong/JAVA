
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        // BufferedReader와 BufferedWriter를 사용하여 입출력 성능을 향상시킴
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄에서 테스트케이스의 개수를 입력받음
        int numi = Integer.parseInt(br.readLine());
        
        // 테스트케이스 개수만큼 반복문을 실행
        for (int i = 0; i < numi; i++) {
            // 각 줄에서 두 정수를 입력받아 공백으로 분리
            String[] numbers = br.readLine().split(" ");
            // 첫 번째 숫자를 정수로 변환
            int num1 = Integer.parseInt(numbers[0]);
            // 두 번째 숫자를 정수로 변환
            int num2 = Integer.parseInt(numbers[1]);

            // 두 숫자의 합을 계산
            int ans = num1 + num2;
            // 결과를 버퍼에 기록
            bw.write(ans + "\n");
        }
        
        // 버퍼에 남아있는 데이터를 모두 출력
        bw.flush();
        // BufferedWriter 스트림을 닫음
        bw.close();
        // BufferedReader 스트림을 닫음
        br.close();
    }
}