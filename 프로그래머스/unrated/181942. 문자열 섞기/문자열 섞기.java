class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int minLength = Math.min(str1.length(), str2.length());
        for(int i=0;i<minLength;i++) {
        	answer += str1.charAt(i)+""+str2.charAt(i);
        }
        return answer;
    }
}