import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 사용자로부터 문자열 입력을 받음
        int num = sc.nextInt(); // 사용자로부터 정수 입력을 받음
        
        // 입력받은 문자열의 (num-1)번째 문자를 가져옴 (index는 0부터 시작하므로)
        char strindex = str.charAt(num-1);
        
        // (num-1)번째 문자를 출력
        System.out.println(strindex);
        
        // Scanner 객체 닫기 
        sc.close();
    }
}
