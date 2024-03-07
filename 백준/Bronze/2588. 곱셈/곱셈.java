import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int answer=0;
		
		String num_string2 = String.valueOf(num2);
		
		for(int i = num_string2.length() - 1; i >= 0; --i) {
			int num_s2 = Character.getNumericValue(num_string2.charAt(i));
			answer = num_s2*num1;
			System.out.println(answer);
			}
		
	
		int answer2 = num1 * num2;
		System.out.println(answer2);
		
		sc.close();
		
}
}