class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) { // 홀수인 경우 홀수의 합을 구함
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else { // 짝수인 경우 짝수의 제곱의 합을 구함
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }
        
        return answer;
    }
}