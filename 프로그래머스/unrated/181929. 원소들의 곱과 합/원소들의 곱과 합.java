class Solution {
    public int solution(int[] num_list) {
        	int answer1 = 1;
	        int answer2 = 1;
            int num=0;
	        for(int i =0;i<num_list.length;i++){    // 원소들의 곱
	            answer1 *= num_list[i];
	        }
	        for(int i=0;i<num_list.length;i++){ // 원소들의 합
	            num += num_list[i];
                answer2 = (int)Math.pow(num,2);  // 제곱
	        }
	        int min;
	        if(answer1<answer2){
	            min = 1;
	        }
	        else{
	            min = 0;
	        }
        return min;
    }
}