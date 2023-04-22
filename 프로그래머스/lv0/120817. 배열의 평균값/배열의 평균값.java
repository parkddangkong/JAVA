class Solution {
    public double solution(int[] number) {
    double answer = 0;
    int sum = 0;
    
    for(int i =0;i<number.length;i++){
        sum+=number[i];
    }
    
    answer = (double)sum/number.length;
    
    return answer;
    }
}