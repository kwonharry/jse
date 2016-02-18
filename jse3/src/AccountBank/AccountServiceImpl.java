package AccountBank;

public class AccountServiceImpl implements AccountService {
	//필드
	

AccountBean account= new AccountBean();
	
	//메소드 에어리어
	
	
	@Override
	public String open(String name, int password) {
		// 1.통장개설 
		//account 인스턴스를 필드에 선언하면 나중에 추가되는 값을 오버라이딩하게 된다. 추가되는 개념으로 코딩하려면
		// 지역변수로 처리하고 자료구조(컬렉션)을 필드에 선언해야 한다.
		AccountBean account = new AccountBean();
		account.setName(name);
		account.setPassword(password);
	
		return account.toString();
	}

	



	@Override
	public String deposit(int money) {
		// 2.입금
		
		account.setMoney(account.getMoney()+money);
		return "잔액"+account.getMoney();
		
		
	}

	@Override
	public String withdraw(int money) {
		// 3.출금
		return  (account.getMoney()-money<0) ? "잔액 부족. 다시 입력하세요." : this.saveMoney(money);
	}

	private String saveMoney(int money) {
		account.setMoney(account.getMoney()-money);
		return "잔액 :" + account.getMoney();
	}

	@Override
	public String search() {
		// 4.잔액조회
		return "잔액 : "+account.getMoney();
	}

}
