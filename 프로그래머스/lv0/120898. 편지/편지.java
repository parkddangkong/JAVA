class Solution {
    public int solution(String message) {
          int add=0;
        char[] ch = message.toCharArray();
        for(int i =0; i<message.length();i++) {
        	add++;
        }
        return add*2;
    }
}