class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
		int num = 0;
		for (int i = n; i < num_list.length; i++) {
			answer[num] = num_list[i];
			num++;
		}
		for(int i = 0;i < n;i++) {
			answer[num] = num_list[i];
			num++;
		}
        
        return answer;
    }
}