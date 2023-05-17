class Solution {
    public int solution(int n) {
        int answer = 0;
        int max =7;
        if(max<n) {
        	answer = (n/max)+1;
        	if(n%7==0) {
        		answer = n/max;
        	}
        }
        else {
        	answer =1;
        }
        return answer;
    }
}