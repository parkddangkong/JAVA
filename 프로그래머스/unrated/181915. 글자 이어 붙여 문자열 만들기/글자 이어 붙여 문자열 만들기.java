class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i =0;i<index_list.length;i++) {
        	answer += ch[index_list[i]];
        }
        return answer;
    }
}