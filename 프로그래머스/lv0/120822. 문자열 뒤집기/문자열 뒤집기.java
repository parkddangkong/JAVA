class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i = ch.length-1;-1<i;i--) {
        	answer += ch[i];
        }
        return answer;
    }
}