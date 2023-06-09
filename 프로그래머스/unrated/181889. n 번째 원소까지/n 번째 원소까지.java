class Solution {
    public int[] solution(int[] num_list, int n) {
       int[] answer = new int[n];
        int num=0;
        for(int i= 0;i<n;i++) {
        	answer[num] = num_list[i];
        	num++;
        }
        return answer;
    }
}