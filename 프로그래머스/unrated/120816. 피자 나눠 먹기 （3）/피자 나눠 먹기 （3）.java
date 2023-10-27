class Solution {
    public int solution(int slice, int n) {
       int answer = 1;
        
        while(n-(slice * answer) > 0) {
        	answer++;
        }
        
        return answer;
    }
}