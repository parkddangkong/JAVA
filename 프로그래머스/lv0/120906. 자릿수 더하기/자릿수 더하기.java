class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        char[] ch = num.toCharArray();
        for(int i =0; i<num.length();i++) {
        	answer += ch[i]-'0';
        }
        return answer;
    }
}