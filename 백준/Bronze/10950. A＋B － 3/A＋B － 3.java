import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int ans = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= num; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			ans = num1+num2;
			
			list.add(ans);
		}
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}

		sc.close();

	}
}
