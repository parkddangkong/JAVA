import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        sc.nextLine(); // 정수 입력 후 남아 있는 줄바꿈 문자 소비

        String str = sc.nextLine(); // 공백을 포함한 문자열을 입력받음
        


        String[] numbers = str.split("\\s+");
        
        // ArrayList에 숫자들을 저장
        ArrayList<String> list = new ArrayList<>();
        for (String number : numbers) {
            list.add(number);
        }
        
        // 공백을 기준으로 문자열 분리
        int scnum = sc.nextInt();
        sc.nextLine();
        int numans = 0;
        
        if(times == list.size()) {
        	for(int i =0;i<list.size();i++) {
        		int num = Integer.parseInt(list.get(i));
        		if(scnum == num) {
        			numans++;
        		}
        	}
        }

        System.out.println(numans);
        sc.close();
    }
}