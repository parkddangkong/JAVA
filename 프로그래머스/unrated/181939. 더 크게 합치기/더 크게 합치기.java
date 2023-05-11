class Solution {
    public int solution(int a, int b) {
        		int answer = 0;
		int add1,add2;
		String num1 = Integer.toString(a);
		String num2 = Integer.toString(b);
		String sum = num1 + num2;
		add1 = Integer.parseInt(sum);
		String sum2 = num2+num1;
		add2 = Integer.parseInt(sum2);
		
		if(add1>=add2) {
			answer = add1;
		}
		else if(add2>add1) {
			answer = add2;
		}
        return answer;
    }
}