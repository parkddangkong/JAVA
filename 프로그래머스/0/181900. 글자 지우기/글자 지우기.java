import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);

        // indices 배열을 오름차순으로 정렬 (뒤에서부터 지우면 앞의 인덱스에 영향을 미치지 않음)
        Arrays.sort(indices);

        // 오름차순으로 정렬한 indices 배열을 이용하여 해당 인덱스의 문자를 제거
        for (int i = indices.length - 1; i >= 0; i--) {
            int indexToRemove = indices[i];
            // 해당 인덱스의 문자를 제거
            answer.deleteCharAt(indexToRemove);
        }

        return answer.toString();
    }
}