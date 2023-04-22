class Solution {
    public int solution(int n, int k) {
        int answer;
        int drink;
        
        answer = n*12000;
        drink = k*2000;
        
        if(n>=10){
            drink -= (n/10)*2000; 
        }
        
        
        return answer+ drink;
    }
}