import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine().trim(); // 입력 문자열을 받고 양 끝 공백을 제거
        
        if (input.isEmpty()) {
            System.out.println(0); // 입력이 공백만 있을 경우 0 출력
            sc.close();
            return;
        }
        
        // 정규 표현식을 사용하여 공백을 기준으로 단어들을 분리
        String[] words = input.split("\\s+");
        
        System.out.println(words.length); // 분리된 단어의 개수 출력
        
        sc.close();
    }
}