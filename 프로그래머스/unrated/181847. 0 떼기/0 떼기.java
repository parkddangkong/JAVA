class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        if(n_str.charAt(0) == '0') {	// 가장 왼쪽 처음이 0일 때  시작
        	int i =0;
        	while(n_str.charAt(i) == '0') {	// 0인 친구들을 한 번에 묶음
        		i++;
        	}
        	answer = n_str.substring(i); // 0 친구들이 끝날때까지 뽑아줌
        }
        return answer;
    }
}