class Solution {
    public int solution(int num1, int num2) {
         double num3 = (double)num1/num2;
        System.out.println("num3 : "+num3);
        double answer = num3*1000;
        return (int)answer;
    }
}