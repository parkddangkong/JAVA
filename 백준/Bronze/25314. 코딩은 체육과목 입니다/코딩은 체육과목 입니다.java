import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받을 변수
        int num = sc.nextInt();

        // long의 개수를 구합니다.
        int count = num / 4;

        // "long"을 count 번 출력합니다.
        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }

        // 마지막에 "int"를 출력합니다.
        System.out.println("int");

        sc.close();
    }
}