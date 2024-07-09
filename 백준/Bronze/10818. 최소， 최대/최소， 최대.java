import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // 스캐너 객체를 생성하여 사용자 입력을 받습니다.
        
        int times = sc.nextInt();  // 정수 입력을 받아서 times 변수에 저장합니다.
        sc.nextLine();  // 다음 줄로 이동합니다.
        String num = sc.nextLine();  // 한 줄을 입력받아 num 변수에 저장합니다.
        
        String[] list = num.split(" ");  // 입력받은 문자열을 공백을 기준으로 분리하여 배열에 저장합니다.
        
        ArrayList<Integer> listnum = new ArrayList<>();  // 정수를 저장할 ArrayList를 생성합니다.
        
        // times가 list의 길이가 크거나  같을 때만 실행합니다.
        if(times >= list.length) {
            // list 배열의 요소들을 정수로 변환하여 listnum 리스트에 추가합니다.
            for(int i = 0; i < list.length; i++) {  // 반복 조건을 i > list.length에서 i < list.length로 수정
                listnum.add(Integer.parseInt(list[i]));  // 문자열을 정수로 변환하여 listnum에 추가합니다.
            }
        }
        
        int max = listnum.get(0);  // 최대값을 저장할 변수를 초기화합니다.
        int min = listnum.get(0);  // 최소값을 저장할 변수를 초기화합니다.
        
        // listnum 리스트에서 최대값을 찾습니다.
        for(int i = 0; i < listnum.size(); i++) {
            if(listnum.get(i) > max) {  // 현재 요소가 max보다 크면
                max = listnum.get(i);  // max를 현재 요소로 갱신합니다.
            }
        }
        
        // Collections.min 메서드를 사용하여 listnum 리스트에서 최소값을 찾습니다.
        min = Collections.min(listnum);
        
        System.out.print(min + " ");  // 최소값을 출력합니다.
        System.out.print(max);  // 최대값을 출력합니다.
        
        // 스캐너를 닫습니다.
        sc.close();
    }
}