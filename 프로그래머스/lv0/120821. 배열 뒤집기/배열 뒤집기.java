class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i =num_list.length-1;i>-1;i--) {
        	answer[num_list.length-1-i] = num_list[i];
            // [answer의 인덱스 자리] 
        }
        return answer;
    }
}