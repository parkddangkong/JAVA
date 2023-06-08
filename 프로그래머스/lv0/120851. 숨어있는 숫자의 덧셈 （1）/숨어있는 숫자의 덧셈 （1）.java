class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "1234567890";
        for(int i =0;i<my_string.length();i++) {
        	for(int j= 0;j<num.length();j++) {
        		if(my_string.charAt(i) == num.charAt(j)) {
        			answer += my_string.charAt(i) -'0';
        		}
        	}
        }
        return answer;
    }
}