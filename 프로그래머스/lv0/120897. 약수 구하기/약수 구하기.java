class Solution {
    public int[] solution(int n) {
      int[] answer = new int[n];
        int num = 0;
        for(int i= 1;i<=n;i++) {
        	if(n%i==0) {
        		answer[num] = i;
        		num++;
        	}
        }
        int[] array = new int[num];
        System.arraycopy(answer, 0, array, 0, num);
        return array;
    }
}