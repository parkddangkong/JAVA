class Solution {
    public int[] solution(int[] arr) {
        // 주어진 배열의 길이
        int length = arr.length;
        
        // 2의 거듭제곱인지 확인
        if (!isPowerOfTwo(length)) {
            // 2의 거듭제곱이 아니라면, 필요한 0의 개수 계산
            int nextPowerOfTwo = getNextPowerOfTwo(length);
            int additionalZeros = nextPowerOfTwo - length;

            // 새로운 배열 생성하여 0 추가
            int[] newArr = new int[nextPowerOfTwo];
            System.arraycopy(arr, 0, newArr, 0, length);
            return newArr;
        } else {
            // 이미 2의 거듭제곱이라면 그대로 반환
            return arr;
        }
    }
    
    // 주어진 숫자가 2의 거듭제곱인지 확인하는 함수
    private boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
    
    // 다음으로 큰 2의 거듭제곱을 찾는 함수
    private int getNextPowerOfTwo(int n) {
        int result = 1;
        while (result < n) {
            result *= 2;
        }
        return result;
    }
}