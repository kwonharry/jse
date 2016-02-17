package operation;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("학생 이름 : ");
		String name = scanner.next();

		System.out.println("국어 점수 : ");
		int kor = scanner.nextInt();

		System.out.println("영어 점수 : ");
		int eng = scanner.nextInt();

		System.out.println("수학 점수 : ");
		int math = scanner.nextInt();

		System.out.println("과학 점수 : ");
		int sci = scanner.nextInt();

		int sum = kor + eng + math + sci;
		double avg = sum / 4;
		
		String result= name + "의 총점은" + sum + "점이고, 평균은 " + avg + "점으로";
		
		if (avg>=90.0) {
			System.out.println(result+ " 장학생입니다.");
		} else if(avg>=60){
			System.out.println(result+ " 합격입니다.");
		} else{
			System.out.println(result+ " 불합격입니다.");
		}
		
		
		
		
	}
}
