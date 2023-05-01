import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int로 정수를 받아줌
        
        int c = a+b;  
        // int타입 변수 c를 만들어서 a+b가 들어감

        System.out.printf("%d + %d = %d",a,b,c);
    }
}