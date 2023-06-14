import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
		String answer = "";
		
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);			// char 타입으로 바꿔줌
			if(Character.isUpperCase(c)) {	// character의 대문자 안에서 c가 포함이 되면
				answer += Character.toLowerCase(c);	// 소문자로 바뀜
			}
			else {
				answer += Character.toUpperCase(c);	// 대문자로 바뀜
			}
		}
		
		System.out.println(answer);
	}
}