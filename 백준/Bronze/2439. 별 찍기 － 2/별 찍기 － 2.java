import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 객체를 생성하여 사용자 입력을 받을 준비를 합니다.
        Scanner sc = new Scanner(System.in);

        // 사용자가 입력한 정수를 변수 times에 저장합니다.
        int times = sc.nextInt();

        // 1부터 times까지 반복합니다.
        for (int i = 1; i <= times; i++) {
            // 각 줄에서 i보다 큰 times-i개의 공백을 출력합니다.
            for (int j = times; j > i; j--) {
                System.out.print(" ");
            }
            // 각 줄에서 i개의 별을 출력합니다.
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            // 줄 바꿈을 합니다.
            System.out.println();
        }
    }
}