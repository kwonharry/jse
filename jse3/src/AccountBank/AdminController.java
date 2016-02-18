package AccountBank;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		AdminService admin=new AdminServiceImpl();
		AccountService account = new AccountServiceImpl();
		Scanner scanner =new Scanner(System.in);
		
		while (true) {
			
			System.out.println(
					"업무선택: \n0.계좌 개설"
					+ "\n1. 전체 계좌 수 조회\n"
					+ "2. 계좌번호로 해당 계좌 정보 조회\n"
					+ "3. 이름으로 계좌 정보 조회\n"
					+ "4. 계좌 삭제\n"
					+ "5. 이름으로 계좌 수 조회\n"
					+"6. 종료");
			switch(scanner.nextInt()){
			case 0: 
			
				System.out.println("이름과 비밀번호를 입력하세요.");
				
				System.out.println("정보 : "+admin.open(scanner.next(), scanner.nextInt()));
				break;
			case 1:
			System.out.println("계좌 개수는"+ admin.countAll());
				break;
			case 2:
				System.out.println("조회하려는 계좌번호 입력 : ");
				System.out.println("조회한 계좌 :"+admin.searchAccountByAccountNo(scanner.nextInt()).toString());
				break;
			case 3:
				System.out.println("조회하려는 이름 입력 : ");
				AccountBean[] accounts=admin.searchAccountByName(scanner.next());
				for (int i = 0; i < accounts.length; i++) {
					System.out.println("조회한 계좌"+accounts[i]);	
				}
				break;
			case 4:
				System.out.println("삭제하려는 계좌번호 입력");
				System.out.println(admin.closeAccount(scanner.nextInt()));
				break;
			case 5:
				System.out.println("조회하려는 이름 입력");
				System.out.println(admin.searchAccountByName(scanner.next()));
						break;
			case 6:return;
			
			default:System.out.println("1번부터 6번 사이에서 선택가능합니다.");break;
			}
			}
		}
		
	}

