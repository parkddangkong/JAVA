class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
	        int even =0, odd=0;
	        for(int i =0; i<num_list.length;i++) {  //num_list의 배열 인덱스
	        	if(num_list[i] % 2 == 0) {  // 조건을 붙여서 짝수를 찾음
	        		even++; // even은 0이지만 조건에 맞을 때 마다 +1이 됨(짝수 개수)
	        	}
	        	else if(num_list[i] % 2 != 0){ 
	        		odd++; //odd는 0이지만 조건에 맞을 때마다 +1이 됨(홀수 개수)
	        	}
	        }
	        answer[0] = even;   //answer 배열의 0번째 자리에 even을 넣음
	        answer[1] = odd;    //answer 배열의 1번째 자리에 odd을 넣음
        return answer;
    }
}