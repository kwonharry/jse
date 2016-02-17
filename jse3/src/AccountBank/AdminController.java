package AccountBank;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		AccountService account = new AccountServiceImpl();
		Scanner scanner =new Scanner(System.in);
		
		while (true) {
			System.out.println(
					"업무선택: 1. 전체 계좌 수 조회\n"
					+ "2. 계좌번호로 해당 계좌 정보 조회\n"
					+ "3. 이름으로 계좌 정보 조회\n"
					+ "4. 계좌 삭제\n"
					+ "5. 이름으로 계좌 수 조회\n"
					+"6. 종료");
			switch(scanner.nextInt()){
			case 1:break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6:return;
			
			default:System.out.println("1번부터 6번 사이에서 선택가능합니다.");break;
			}
			}
		}
		
	}

