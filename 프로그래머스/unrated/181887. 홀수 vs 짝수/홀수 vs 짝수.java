class Solution {
    public int solution(int[] num_list) {
         int answer = 0;
        int even = 0, odd = 0;
        for(int i=0;i<num_list.length;i++) {
        	int num = num_list[i];
        	if(i % 2==0) {
        		even += num;
        	}
        	else {
        		odd += num;
        	}
        }
        if(even>odd) {
        	answer = even;
        } else {
        	answer = odd;
        }
        return answer;
    }
}