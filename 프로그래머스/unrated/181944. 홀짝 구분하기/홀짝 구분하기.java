import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
          if(n %2 ==0) {
            // 짝수이기 때문에 나머지가 0이 되는 숫자 출력
	        	System.out.printf("%d is even",n);
	        }
	        else {
            // 짝수를 제외한 나머지를 출력
	        	System.out.printf("%d is odd",n);
	        }
        
    }
}