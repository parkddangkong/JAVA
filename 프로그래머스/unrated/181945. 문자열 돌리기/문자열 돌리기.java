import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();    // toCharArray() 메소드는 String 클래스의 메소드 중 하나로, 문자열을 문자 배열로 변환
		
		for(int i =0;i<ch.length;i++) { // 문자열을 세우기 위한 for문
			System.out.println(ch[i]);  // println으로 하나씩 출력하며 줄을 바꿔줌
		}
    }
}