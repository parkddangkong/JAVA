class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
    	 // 가변적인 문자열을 효율적으로 조작하는 Java 클래스로, 
    	 // append, insert, delete, reverse 등의 메서드를 활용하여 문자열을 효과적으로 수정하고, 마지막에 toString 메서드를 통해 결과를 문자열로 변환
         char[] strch = my_string.toCharArray();

         for (int i = 0; i < strch.length; i++) {
             // 중복 문자 중에서 현재 문자가 처음 등장한 인덱스를 확인
             int firstIndex = my_string.indexOf(strch[i]);

             // 중복이 아니거나 중복 문자 중에서 첫 번째로 등장한 경우에만 추가
             if (i == firstIndex) {
                 answer.append(strch[i]);
                 // append = 문자열에 새로운 내용을 추가하는 메서드
             }
         }

         return answer.toString();
    }
}