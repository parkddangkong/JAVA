import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 요구되는 각 체스 기물의 개수 (검정색 기물의 개수)
        int[] black = {1, 1, 2, 2, 2, 8};
        
        // 사용자로부터 흰색 체스 기물의 개수를 입력
        String white = sc.nextLine();
        // 입력된 문자열을 공백을 기준으로 나누어 배열로 만듦
        String[] whiteline = white.split(" ");
        
        // 문자열 배열을 정수형 리스트로 변환
        ArrayList<Integer> whitelist = new ArrayList<Integer>();
        for(int i = 0; i < whiteline.length; i++) {
            whitelist.add(Integer.valueOf(whiteline[i]));
        }
        
        // 검정색 기물의 개수와 흰색 기물의 개수 간의 차이를 저장할 리스트를 만듦
        ArrayList<Integer> anslist = new ArrayList<Integer>();
        for(int i = 0; i < whitelist.size(); i++) {
            if(black[i] != whitelist.get(i)) {
                // 필요 개수와 주어진 개수의 차이를 계산하여 리스트에 추가
                int num = black[i] - whitelist.get(i);
                anslist.add(num);
            } else {
                // 개수가 맞으면 0을 리스트에 추가
                anslist.add(0);
            }
        }
        
        // 결과를 출력
        for(int i = 0; i < anslist.size(); i++) {
            System.out.print(anslist.get(i) + " ");
        }

        sc.close();
    }
}