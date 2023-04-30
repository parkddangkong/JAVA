import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
       for(int i =0;i<n;i++){
           // for 조건식을 이용해서 문장을 반복시킴
           // 변수 초기화(시작점); 조건식(도착점 및 반복 횟수); 증감식(보폭);
           System.out.print(str);
       }
    }
}