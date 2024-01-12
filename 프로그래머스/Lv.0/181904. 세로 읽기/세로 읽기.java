class Solution {
    public String solution(String my_string, int m, int c) {
      String answer = "";

        int arrsize = ((my_string.length() - 1) / m)+1;
        // 배열 사이즈를 구할 때 밖에서 계산하고 안에 대괄호 안에 써야한다.
        
        String[] arr = new String[arrsize];
        // 배열을 만들면서 크기 지정
        
        int arrIndex = 0; // 배열 인덱스를 추적할 변수 추가
        //
        
        for (int i = 0; i < my_string.length(); i += m) {
            int endIndex = Math.min(i + m, my_string.length());
            String str1 = my_string.substring(i, endIndex);
            arr[arrIndex] = str1;
            arrIndex++;
        }
        
        for(int j = 0; j < arr.length ; j++) {
        	String str2 = arr[j];
        	answer += str2.substring(c-1,c);
        }
        return answer;
    }
}