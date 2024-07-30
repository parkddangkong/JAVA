

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Scanner 객체를 사용하여 사용자 입력을 받음
		Scanner sc = new Scanner(System.in);

		HashMap<String, Double> averageGrade = new HashMap<String, Double>();

		// 학점과 점수를 HashMap에 삽입합니다.
		averageGrade.put("A+", 4.5);
		averageGrade.put("A0", 4.0);
		averageGrade.put("B+", 3.5);
		averageGrade.put("B0", 3.0);
		averageGrade.put("C+", 2.5);
		averageGrade.put("C0", 2.0);
		averageGrade.put("D+", 1.5);
		averageGrade.put("D0", 1.0);
		averageGrade.put("F", 0.0);

		double totalGradePoints = 0; // (학점 × 과목평점)의 총합
		double totalCredits = 0; // 총 학점

		for (int i = 0; i < 20; i++) {
			String grades = sc.nextLine();
			String[] gradeslist = grades.split(" ");

			double credit = Double.parseDouble(gradeslist[1]);
			String grade = gradeslist[2];

			if (!"P".equals(grade)) { // P 학점은 계산에서 제외
				double gradePoint = averageGrade.get(grade);
				totalGradePoints += credit * gradePoint;
				totalCredits += credit;
			}
		}

		double totalavg = totalCredits == 0 ? 0 : totalGradePoints / totalCredits;

		System.out.printf("%.6f", totalavg);

		sc.close();
	}
}
