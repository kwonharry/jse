package AccountBank;

public class AdminServiceImpl implements AdminService {
	AccountBean account = new AccountBean();
	
	private AccountBean[] accountList;
	int count=0; //멤버변수지만 초기값이 필요한 경우에는 쓸 수 있다
	//초기화는 동작이며, 동작(기능)은 메소드 담당
	
	//생성자 : 객체를 생성하는 메소드
	//메소드에어리어
	public AdminServiceImpl(int count){
		
	accountList=new AccountBean[count];
	}
	
	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}

	public AccountBean[] getaccountList() {
		return accountList;
	}





	public void setaccountList(AccountBean[] accountList) {
		this.accountList = accountList;
	}



	@Override
	public String open(String name, int password) {
		// 1.통장개설
		
		account.setName(name);
		account.setPassword(password);
		accountList[count]=account;
		count++;
		return account.toString();
	}

	
	
	public int countAll() {
		// 1. 전체 계좌 수 조회
		return this.getCount();
	}

	@Override
	public AccountBean searchAccountByAccountNo(int accountNo) {
		//2. 계좌번호로 해당 계좌 정보 조회
		AccountBean account=null;
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getAccountNo()==accountNo) {
				account=accountList[i];
			}
		}
		
		return account;
	}

	@Override
	public AccountBean[] searchAccountByName(String name) {
		// 3. 이름으로 계좌 정보 조회
		AccountBean[] tempList= new AccountBean[this.searchCountByName(name)];
		int j=0;
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getName().equals(name)) {
				tempList[j]=accountList[i];
				j++;
			}
		}
		
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 4. 계좌 삭제
		String result="";
		
		if (this.searchAccountByAccountNo(accountNo)!=null) {
			for (int i = 0; i < accountList.length; i++) {
				if(accountList[i].getAccountNo()==accountNo){
					//위에서 앞으로 당기는 것은 배열의 크기가 크면 시간 로스가 생기므로
					// 맨 뒷 값을 해당 칸에 할당하고 뒷칸을 null로 만드는 것이 효율적
					
					accountList[i]=accountList[this.getCount()-1];
				    accountList[this.getCount()-1]=null;
					
					}
			}
			
			this.setCount(this.getCount()-1);
			result="삭제 성공";
		}else{
			result="해당 계좌가 없음";
	
		}
		
		return result;
	}

	@Override
	public int searchCountByName(String name) {
		// 5. 이름으로 계좌 수 조회 (3번 기능을 수행하기 위해 필요한 메소드)
		int tempCount=0;
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getName().equals(name)) {
				tempCount++;
			}
		}
		return tempCount;
	}

}
