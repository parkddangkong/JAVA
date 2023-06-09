class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int num = 0;
        for(int i = 0;i<numlist.length;i++) {
        	if(numlist[i]%n ==0) {
        		num++;
        	}
        }
    
        answer = new int[num];
        int num2 = 0;
        for(int i = 0;i<numlist.length;i++) {
        	if(numlist[i]%n ==0) {
        		answer[num2] = numlist[i];	
        		num2++;
        	}
        }
        return answer;
    }
}