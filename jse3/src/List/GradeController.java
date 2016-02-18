package List;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		GradeService service=new GradeServiceImpl();
		GradeBean grade=new GradeBean();
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("***성적관리 프로그램***");
			System.out.println("[메뉴]" + "\n 0. 등록" + "\n 1. 성적표 목록" + "\n 2. 학번으로 성적표 찾기" + "\n 3. 이름으로 성적표 찾기"
					+ "\n 4. 성적순 정렬" + "\n 5. 이름순 정렬" + "\n 6. 종료");
			switch (s.nextInt()) {

			case 0:
				System.out.println("학번, 이름, 자바점수, 오라클점수,스프링점수 입력");
				service.input(new GradeBean(s.next(),s.next(),s.nextInt(),s.nextInt(),s.nextInt()));	
				service.input(grade);
				break;
			
			case 1:
				System.out.println(service.getList());
				break;
			case 2:
				System.out.println("학번 입력");
				System.out.println(service.searchByHak(s.next()));
				break;
			case 3:
				System.out.println("이름 입력");
				System.out.println(service.searchByName(s.next()));
				break;
			case 4:
				service.descGradeByTotal();
				System.out.println(service.getList());
				break;
			case 5:
				service.ascGradeByName();
				System.out.println(service.getList());
				break;
			case 6:return;

			default:
				System.out.println("잘못된 번호 선택");
				break;
			}

		}
	}
}