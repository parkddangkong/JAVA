class Solution {
    public int solution(int num1, int num2) {
        boolean val = (0<=num1&&num1<=100&&0<=num2&&num2<=100);
        int answer = 0;
        
        if(num1==num2){
            answer = 1;
        }
        else{
            answer = -1;
        }
        return answer;
    }
}