class Solution {
    public int solution(int a, int b) {
        int answer = 0;
         String a2 = Integer.toString(a);
        String b2 = Integer.toString(b);
        String c = a2 + b2;
        
        int total1 = Integer.parseInt(c);
        int total2 = a*2*b;
        
        if(total1 > total2) {
        	answer = total1;
        }
        else if(total1 == total2) {
        	answer = total1;
        }
        else {
        	answer = total2;
        }
        return answer;
    }
}