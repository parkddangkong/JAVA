class Solution {
    public int solution(int num, int k) {
         int answer = -1;
        
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
        	if(Integer.parseInt(String.valueOf(ch[i])) == k) {
        		answer = i+1 ;
        		break;
        	}
        }
        return answer;
    }
}