class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String sentence1 = my_string.substring(0,s);
        String sentence2 = sentence1+overwrite_string;
        String sentence3 = my_string.substring(sentence2.length());
        answer = sentence1+ overwrite_string + sentence3 ;
        return answer;
    }
}