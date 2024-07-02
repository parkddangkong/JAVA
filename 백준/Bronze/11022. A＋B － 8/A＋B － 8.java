
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{

        // BufferedReader와 BufferedWriter를 사용하여 입력과 출력을 효율적으로 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 입력을 받아 처리할 테스트 케이스의 수(times)로 변환
        int times = Integer.parseInt(br.readLine());
        int num = 0;

        // 주어진 테스트 케이스의 수만큼 반복
        for(int i = 1; i <= times; i++) {
            // 한 줄의 입력을 받아 공백을 기준으로 나누어 배열에 저장
            String[] numbers = br.readLine().split(" ");

            // 나눈 문자열을 정수로 변환
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);

            // 두 숫자를 더함
            int ans = num1 + num2;
            num++;

            // 결과 문자열을 형식에 맞게 생성
            String str = "Case #" + num + ": "+ num1 + " + " + num2 + " = " + ans;

            // 결과 문자열을 버퍼에 저장
            bw.write(str + "\n");
        }

        // 버퍼에 저장된 내용을 출력
        bw.flush();
        // BufferedWriter를 닫음
        bw.close();
        // BufferedReader를 닫음
        br.close();
    }
}
