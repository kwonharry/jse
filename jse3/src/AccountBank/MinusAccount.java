package AccountBank;

public class MinusAccount extends AccountServiceImpl{
	private int money;
	private String name;
	private int accountNo;
	private int password;
	public static final String BANK = "러시앤캐시";
	
	
	@Override
	public String withdraw(int money) {
		if(money>this.money){
		System.out.println("잔액을 소진한 잔액은 대출로 전환합니다.");	
		
		}
		else{
			
		}
		return super.withdraw(money);
	}
	public String loan(){
	System.out.println("대출가능합니다.");
		return "300만원 대출";
	}
}
