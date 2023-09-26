class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String ans1 = my_string.substring(0,s);
        String ans2 = my_string.substring(s,e+1);
        StringBuilder mid = new StringBuilder(ans2).reverse();
        String ans3 = my_string.substring(e+1);
        
        answer = ans1 + mid + ans3;
        
        return answer;
    }
}