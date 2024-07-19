import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력 문자열을 읽어옴
        String str = sc.nextLine();
        
        // 입력 문자열을 공백을 기준으로 분리하여 문자열 배열로 만듦
        String[] strlist = str.split(" ");

        // 정수를 저장할 리스트
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        
        // 변환된 문자열을 저장할 리스트
        ArrayList<String> strlist2 = new ArrayList<String>();
        
        // 임시 문자열 저장 변수
        String str2 = "";
        
        // 각 단어를 문자 배열로 변환하여 저장할 변수
        char[] chlist = {};

        // 입력된 각 단어에 대해 반복
        for (int i = 0; i < strlist.length; i++) {
            // 단어를 문자 배열로 변환
            chlist = strlist[i].toCharArray();
            
            // 문자를 역순으로 결합하여 str2에 저장
            for (int j = chlist.length - 1; j >= 0; j--) {
                str2 += Character.toString(chlist[j]);
            }
            
            // 역순으로 변환된 단어를 리스트에 추가
            strlist2.add(str2);
            
            // str2를 초기화
            str2 = "";
        }

        // 변환된 문자열 리스트를 정수 리스트로 변환
        for (int i = 0; i < strlist2.size(); i++) {
            intlist.add(Integer.parseInt(strlist2.get(i)));
        }

        // 정수 리스트에서 최대값을 찾음
        int max = Collections.max(intlist);

        // 최대값을 출력
        System.out.println(max);
        
        // 스캐너를 닫음
        sc.close();
    }
}
