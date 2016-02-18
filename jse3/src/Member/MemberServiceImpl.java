package Member;

public class MemberServiceImpl implements MemberService{
	

	MemberBean member = new MemberBean();
	int count = 0;
	private MemberBean[] memberList = new MemberBean[100];

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	@Override
	public String login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Update(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public String join(MemberBean member) {
		// 회원가입

		memberList[count]= member;		
		count++;

		return "회원 가입 완료!!!!";
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보검색

		for (int i = 0; i < memberList.length; i++) {

			if (memberList[i].getUserid().equals(id)) {
				member=memberList[i];
			}
		}
		return member;
	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 이름으로 회원정보검색
		
		MemberBean[] tempList=new MemberBean[this.searchCountByname(name)];
		int j=0;
		
		for (int i = 0; i < tempList.length; i++) {
			if (member.getName().equals(name)) {
				tempList[j]=memberList[i];
			    j++;
			}
		}
		
		return tempList;
	}

	@Override
	public String remove(String id) {
		// 회원탈퇴
		
		for (int i = 0; i < memberList.length; i++) {
			if (member.getUserid()==id) {
				memberList[i]=memberList[memberList.length-1];
				memberList[memberList.length-1]=null;
			}
		}
		
		return "탈퇴시키기 성공!!!";
	}

	@Override
	public int countAll() {
		// 회원 수 세기
		return this.getCount();
	}

	@Override
	public int searchCountByname(String name) {
		// 이름으로 회원 수 세기
		int n=0;
		for (int i = 0; i < memberList.length; i++) {
			if (member.getName().equals(name)) {
				
				n++;
			}
		}
		
		return n;
	}



}
