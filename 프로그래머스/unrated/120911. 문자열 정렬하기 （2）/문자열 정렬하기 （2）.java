import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
    	answer = my_string.toLowerCase();
    	// 문자열을 전부 소문자로 바꿈
    	
    	char[] charArr = answer.toCharArray();
    	// toCharArray()는 문자열을 전부 char타입으로 변환시켜 배열로 만들어줌
    	
    	Arrays.sort(charArr);
    	// sort 메서드는 배열이나 리스트의 요소를 알파벳 순서 또는 숫자 순서에 따라 정렬해주는 기능을 제공
    	
    	answer = new String(charArr);
    	// new String(charArr)는 배열이 아닌 다른 타입의 값을 넣어도 문자열로 변환
    	
        return answer;
    }
}