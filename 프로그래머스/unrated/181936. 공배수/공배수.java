class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        // int 타입의 answer 변수 생성
        if(number % n == 0 && number%m ==0){
            // if 조건문에 number의 나머지는 0이 되도록 하는 n,m 배수를 찾는 조건문을 넣             // 어줌
            answer = 1;
            // 조건문에 맞으면 answer에 1이 출력되도록 함
            System.out.println(answer);
        }
        else{
            // 위의 조건문을 제외한 함수에는 answer가 0을 출력하도록 함
            answer = 0;
            System.out.println(answer);
        }
        return answer;
    }
}