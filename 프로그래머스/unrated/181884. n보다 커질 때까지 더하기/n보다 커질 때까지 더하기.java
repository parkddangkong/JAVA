class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        for(int i =0;i<numbers.length;i++) {
        	sum += numbers[i];
        	if(sum > n) {
				answer = sum;
				break;	// 조건을 충족하자마자 for 루프를 빠져나감
	        }
        }
        return answer;
    }
}