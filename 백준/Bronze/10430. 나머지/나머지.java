import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int answer1 = (num1+num2)%num3;
		int answer2 = ((num1%num3) + (num2%num3))%num3;
		int answer3 = (num1*num2)%num3;
		int answer4 = ((num1%num3) * (num2%num3))%num3;
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);

	}

}