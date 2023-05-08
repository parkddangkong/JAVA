class Solution {
    public int solution(int[] num_list) {
          int answer = 0;
            int sum=0;
            int times=1;
	        if(num_list.length>10) {
	        	for(int i =0;i<num_list.length;i++) {
	        		sum += num_list[i];
	        	}
                answer=sum;
	        }
	        else {
	        	for(int i =0;i<num_list.length;i++) {
	        		times *= num_list[i];
	        	}
                answer=times;
	        }
	        return answer;
    }
}