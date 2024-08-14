import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {

        // 첫 번째 구간의 시작과 끝 인덱스
        int f1 = intervals[0][0];
        int f2 = intervals[0][1];
        
        // 두 번째 구간의 시작과 끝 인덱스
        int s1 = intervals[1][0];
        int s2 = intervals[1][1];
        
        // 첫 번째 구간 배열 추출
        int[] ans1 = Arrays.copyOfRange(arr, f1, f2 + 1);
        
        // 두 번째 구간 배열 추출
        int[] ans2 = Arrays.copyOfRange(arr, s1, s2 + 1);
        
        // 두 배열의 길이 합으로 새로운 배열 생성
        int[] answer = new int[ans1.length + ans2.length];
        
        // 첫 번째 배열 복사
        System.arraycopy(ans1, 0, answer, 0, ans1.length);
        
        // 두 번째 배열 복사
        System.arraycopy(ans2, 0, answer, ans1.length, ans2.length);
        return answer;
    }
}