import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Scanner 객체를 생성하여 사용자 입력을 받을 준비를 합니다.
        Scanner sc = new Scanner(System.in);
        
        // 사용자가 입력한 정수를 변수 times에 저장합니다.
        int times = sc.nextInt();
        // 시작 값을 1로 설정합니다.
        int start = 1;
        // 초기 문자열을 "*"로 설정합니다.
        String str = "*";
        
        // start가 times보다 작거나 같은 동안 반복합니다.
        while(start <= times) {
            // 현재 문자열을 출력합니다.
            System.out.println(str);
            // 문자열에 "*"를 하나 더 추가합니다.
            str += "*";
            // start 값을 1 증가시킵니다.
            start += 1;
        }
    }
}