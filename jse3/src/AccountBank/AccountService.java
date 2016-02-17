package AccountBank;

public interface AccountService {	
	//Database에서 CRUO
	//create
	//read
	//update
	//delete
	
	
	//1.통장개설
	public String open(String name, int password);
	//2.입금
	public String deposit(int money);//추상메소드<-> 구상메소드
	//3.출금
	public String withdraw(int money);
	//4.잔액조회
	public String search();
	
}
