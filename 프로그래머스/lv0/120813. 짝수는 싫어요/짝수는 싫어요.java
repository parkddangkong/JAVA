import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        for(int i= 0;i<=n;i++) {
        	if(i%2==1) {
        		answerList.add(i);
        	}
        }
        int[] answer = new int[answerList.size()];
        for(int i=0;i<answer.length;i++) {
        	answer[i] = answerList.get(i);
        }
        return answer;
    }
}