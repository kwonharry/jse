package Date;

import java.util.Scanner;



public class DateController {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int year=0, month=0,end=0;
	DateService date= new DateServiceImpl();
	
	
	while (true) {
		System.out.println("***날짜 프로그램***");
		System.out.println("[메뉴] 1.월일입력 2.현재 날짜와 시간 3.종료");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("년도와 월을 입력하세요.");
			year=scanner.nextInt();
			month=scanner.nextInt();
			end=date.getEndDayOfMonth(year,month);
			System.out.println(year+"년도"+month+"월의 마지막 날은 "+end+"입니다.");
			break;
		case 3:return;
		default:
		System.out.println("다시 입력하세요."); break;
		
		}
		
	}
	
	
}
}
