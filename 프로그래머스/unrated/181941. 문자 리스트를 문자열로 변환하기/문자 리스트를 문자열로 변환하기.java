class Solution {
    public String solution(String[] arr) {
        String answer = ""; // 선언
        for(int i = 0; i<arr.length;i++){   // i 변수는 0부터 배열 arr의 길이(arr.le                                          ngth)보다 작을 때까지 1씩 증가하면서 반복문
            answer += arr[i];
        }
        return answer;
    }
}