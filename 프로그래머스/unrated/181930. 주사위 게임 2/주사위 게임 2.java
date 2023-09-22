class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
           int num1 = a+b+c;
        int num2 = (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
        int num3 = (int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));

        if(a == b && b == c) {
            answer = num1 * num2 * num3;
        }
        else if(a == b || b == c || c == a) {
            answer = num1 * num2;
        }
        else {
            answer = num1;
        }
        return answer;
    }
}