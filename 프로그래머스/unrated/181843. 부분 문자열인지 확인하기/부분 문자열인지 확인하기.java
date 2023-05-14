class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        boolean str = my_string.contains(target);
        answer = str == true ? 1 : 0;
        return answer;
    }
}