package AccountBank;

import java.util.Scanner;

public class AccountController {
	public static void main(String[] args) {
		AccountService account = new AccountServiceImpl();
		Scanner scanner =new Scanner(System.in);
		
		
		while (true) {
			System.out.println("업무선택 : 1.계좌개설 2.입금 3.출금 4.잔액조회 5.종료");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("이름, 비번 입력하시오.");
			
				System.out.println(account.open(scanner.next(), scanner.nextInt()));
				break;
				
			case 2:	
				System.out.println("입금하실 금액을 넣어주세요.");
				System.out.println(account.deposit(scanner.nextInt()));
				break;
			case 3:	
				System.out.println("출금하실 금액을 넣어주세요.");
				System.out.println(account.withdraw(scanner.nextInt()));
				break;
			
			case 4:	
				System.out.println(account.search());
				
				break;
			
			
			
			case 5:	return;

			default:System.out.println("1번부터 5번 사이에서 선택가능합니다.");
			System.out.println("다시선택해주세요.");break;
			}
		}
	}
}
