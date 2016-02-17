package operation;

import java.util.Scanner;

public class FirstGrade {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		/*
		 * 첫번째 학생 이름, 평균
		 * 두번째
		 * 세번째
		 * 
		 * 
		 * 결과 : 홍길동이 1등입니다.
		 * 
		 * */
		System.out.println("첫번째 학생의 이름을 입력하시오");
		String name1=scanner.next();
		
		System.out.println("첫번째 학생의 평균을 입력하시오");
		int score1= scanner.nextInt();
		
		System.out.println("두번째 학생의 이름을 입력하시오");
		String name2=scanner.next();
		
		System.out.println("두번째 학생의 평균을 입력하시오");
		int score2= scanner.nextInt();
		
		System.out.println("세번째 학생의 이름을 입력하시오");
		String name3=scanner.next();
		
		System.out.println("세번째 학생의 평균을 입력하시오");
		int score3= scanner.nextInt();
		
		int temp=0;// 지역변수 local variable
		//지역변수는 반드시 초기화를 해야 한다.
		//초기화란 최초 지역변수를 선언할때 null값을 할당하는 것.
		//변수는 카멜표기법(낙타)으로 표기한다. firstName
		//클래스는 파스칼표기법으로 표기한다. FirstName
		
		
		if (score1>score2 && score1>score3) {
			temp=score1;
		} else if(score2>score3){
			temp=score2;
		}
		else temp=score3;
		
		if(score1==temp){
			System.out.println(name1+"님이 "+score1+"점으로 1등했습니다.");
		}
		else if(score2==temp){
			System.out.println(name2+"님이 "+score2+"점으로 1등했습니다.");
		}
		else 
			System.out.println(name3+"님이 "+score3+"점으로 1등했습니다.");

	
	}
}
