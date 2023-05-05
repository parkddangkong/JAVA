class Solution {
    public int solution(int num, int n) {
        int answer = (num%n == 0) ? 1:0;
        // 삼항식으로 옳으면 1이 틀리면 0이 나오도록 출력
        return answer;
    }
}