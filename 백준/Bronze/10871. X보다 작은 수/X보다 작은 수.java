

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 한 줄 전체를 입력받습니다.
        String input = sc.nextLine();

        // 공백을 기준으로 문자열을 분리하여 배열로 저장합니다.
        String[] numArray = input.split(" ");
        
        // 정수를 저장할 ArrayList를 선언합니다.
        ArrayList<Integer> numlist = new ArrayList<>();
        
        // numArray의 각 요소를 정수로 변환하여 numlist에 추가합니다.
        for(int i = 0; i < numArray.length; i++) {
            numlist.add(Integer.parseInt(numArray[i]));
        }

        // 두 번째 입력값을 받습니다.
        String input2 = sc.nextLine();

        // 공백을 기준으로 문자열을 분리하여 배열로 저장합니다.
        String[] num2Array = input2.split(" ");
        
        // 정수를 저장할 또 다른 ArrayList를 선언합니다.
        ArrayList<Integer> num2list = new ArrayList<>();
        
        // num2Array의 각 요소를 정수로 변환하여 num2list에 추가합니다.
        for(int i = 0; i < num2Array.length; i++) {
            num2list.add(Integer.parseInt(num2Array[i]));
        }
        
        // 첫 번째 리스트의 첫 번째 요소가 두 번째 리스트의 크기보다 크거나 같은 경우
        if(numlist.get(0) >= num2list.size()) {
            // 두 번째 리스트의 각 요소에 대해 처리합니다.
            for(int i = 0; i < num2list.size(); i++) {
                int num = num2list.get(i); // num2list의 현재 요소를 가져옵니다.
                // 첫 번째 리스트의 두 번째 요소와 비교하여 조건을 만족하는 경우 출력합니다.
                if(numlist.get(1) > num) {
                    System.out.print(num + " ");
                }
            }
        }

        // 스캐너를 닫습니다.
        sc.close();
    }
}
