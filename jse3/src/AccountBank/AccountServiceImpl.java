package AccountBank;

public class AccountServiceImpl implements AccountService {
	
	AccountBean account = new AccountBean();
	
	
	@Override
	public String open(String name, int password) {
		// 1.통장개설
		
		account.setName(name);
		account.setPassword(password);

		return account.toString();
	}

	
	@Override
	public String deposit(int money) {
		// 2.입금
		
		account.setMoney(account.getMoney()+money);
		return account.toString();
		
		
	}

	@Override
	public String withdraw(int money) {
		// 3.출금
	
		if(account.getMoney()-money<0){
		System.out.println("잔액 부족. 다시 입력하세요.");
		
		}
		else{
			account.setMoney(account.getMoney()-money);
		}
		return account.toString();
	}

	@Override
	public String search() {
		// 4.잔액조회
		return account.toString();
	}

}
