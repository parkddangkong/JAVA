class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
         char[] ch = my_string.toCharArray();
        for(int i =my_string.length()-n; i<my_string.length();i++) {
        	answer += ch[i];
        }
        return answer;
    }
}