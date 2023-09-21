class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">")) {
        	if(eq.equals("!")) {
        		boolean num = n > m;
        		if(num) {
        			answer = 1;
        		}
        		else {
        			answer = 0 ;
        		}
        	}
        	else {
        		boolean num = n >= m;
        		if(num) {
        		answer = 1;
        		}
        		else{
        			answer = 0;
        		}
        	}
        }
        else if(ineq.equals("<")) {
        	if(eq.equals("!")) {
        		boolean num = n < m;
        		if(num) {
        			answer = 1;
        		}
        		else {
        		answer = 0;
        		}
        	}
        	else {
        		boolean num = n <= m;
        			if(num) {
        				answer = 1;
        			}
        		else {
        			answer = 0;
        		}
        	}
        }
        return answer;
    }
}
