package AccountBank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		/* accountbean의 인스턴스를 만드삼 *
	
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 비번 입력하시오.");

		AccountService account = new AccountServiceImpl();
		account.open(scanner.next(), scanner.nextInt());
		System.out.println("얼마를 입금하실건가요?");

		

		System.out.println(account.deposit(scanner.nextInt()));

		// [한빛뱅크] 홍길동님, 1234계좌 : 잔고 1000원

	}
}
