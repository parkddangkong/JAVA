class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num =0;
        for(int i =0;i<array.length;i++) {
        	if(array[i] ==n) {
        		num++;
        	}
        }
        return answer =num;
    }
}