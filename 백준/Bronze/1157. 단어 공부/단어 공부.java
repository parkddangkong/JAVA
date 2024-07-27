import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력받은 문자열
        String str = sc.nextLine().toUpperCase(); // 대소문자 구분을 없애기 위해 모두 대문자로 변환
        
        // 각 문자의 출현 횟수를 저장할 HashMap
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // 문자열의 각 문자를 순회
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 문자가 이미 HashMap에 있으면 값 증가, 없으면 추가
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // 가장 많이 사용된 알파벳을 찾기 위한 변수들
        char mostFrequentChar = '?';
        int maxCount = 0;
        boolean isDuplicate = false;

        // HashMap을 순회하면서 가장 많이 사용된 알파벳을 찾는다
        char[] keys = new char[charCount.size()];
        int[] values = new int[charCount.size()];
        int index = 0;

        for (Character key : charCount.keySet()) {
            keys[index] = key;
            values[index] = charCount.get(key);
            index++;
        }

        for (int i = 0; i < keys.length; i++) {
            if (values[i] > maxCount) {
                maxCount = values[i];
                mostFrequentChar = keys[i];
                isDuplicate = false;
            } else if (values[i] == maxCount) {
                isDuplicate = true;
            }
        }

        // 중복된 알파벳이 있는 경우 '?' 출력
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(mostFrequentChar);
        }
        
        sc.close();
    }
}