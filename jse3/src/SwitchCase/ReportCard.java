package SwitchCase;
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
		String result= "";
		/*
		
		if (avg>=90.0) {
			result= "장학생";
		} else if(avg>=60){
			result="합격";
		} else{
			result="불합격";
		}
		*/
		int key=0;//지역변수의 초기화
		key=(int) (avg/10);
		switch (key) {
		case 10:
		case 9:
			result="장학생";
			break;
		case 8:
		case 7:
		case 6:
			result="합격";
			break;
		default:
			result="불합격";
			break;
		}
		System.out.println(name+"학생의 총점은 "+sum+"점 이고, 평균은 "+avg+"로 "+result+"입니다.");
	}
}
