import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        // 크로아티아 알파벳을 변환한 문자열로 매핑하는 HashMap을 만듦
        HashMap<String, String> list = new HashMap<String, String>();
        
        // 크로아티아 알파벳과 대응되는 문자열을 HashMap에 추가
        list.put("č", "c=");
        list.put("ć", "c-");
        list.put("dž", "dz=");
        list.put("đ", "d-");
        list.put("lj", "lj");
        list.put("nj", "nj");
        list.put("š", "s=");
        list.put("ž", "z=");
        
        // 크로아티아 알파벳의 개수를 세기 위한 변수
        int num = 0;
        
        // HashMap의 모든 키(크로아티아 알파벳)를 반복
        for (String key : list.keySet()) {
            // 각 키에 해당하는 변환된 값을 가져옵니다.
            String value = list.get(key);
            // 입력 문자열에 해당 변환된 값이 포함되어 있는 동안 반복
            while (str.contains(value)) {
                // 해당 변환된 값을 문자열에서 첫 번째로 발견된 부분을 공백으로 대체한다.
                str = str.replaceFirst(value, " ");
                // 카운트를 증가
                num++;
            }
        }
        
        // 문자열에서 공백을 제거
        str = str.replace(" ", "");
        // 남아있는 알파벳의 개수를 추가
        num += str.length();
        
        // 최종 개수를 출력
        System.out.println(num);
        
        sc.close();
    }
}
