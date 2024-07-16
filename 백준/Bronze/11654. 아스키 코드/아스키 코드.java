import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        // 아스키 코드로 출력하는 법 : 문자 -> 숫자로 변환
        char ch= sc.nextLine().charAt(0);
        int num = (int)ch;
        
        System.out.println(num);
        
        sc.close();
    }
}
