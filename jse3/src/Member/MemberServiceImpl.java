package Member;

import java.util.HashMap;
import java.util.Map;

class MemberServiceImpl implements MemberService{
	

	private MemberBean member ;
	private MemberBean[] memberList;
	private Map<String,MemberBean> map;
	//멤버변수이지만 초기값이 필요한 경우에는 줄 수 있다.
	//초기화는 동작이며, 동작(기능)은 메소드 담당
	
	
	public MemberServiceImpl(){
		member=new MemberBean();
		map = new HashMap<String,MemberBean>();
		
	}
	
	//메소드 에어리어
		@Override
	public String login(String id, String pass) {
		String result="로그인 실패";
		//메소드 체인 기법
		if (map.containsKey(id)) { //맵에 id가 존재하는지를 먼저 체크한다.

			
			
			result=(( map.get(id)).getPassword().equals(pass)) ? "로그인 성공":"비밀번호가 일치하지 않습니다.";


			
		}else{
			result="아이디가 존재하지 않거나, 잘못된 아이디입니다.";
		}
		
		
		return result;
	}

	@Override
	public String Update(MemberBean member) {
		map.replace(member.getUserid(),member);
		return "업데이트 성공";
	}
	
	
	@Override
	public String join(MemberBean member) {
		// 회원가입
		map.put(member.getUserid(), member);
	
		return member.getName()+"님, 회원 가입을 축하드립니다.";
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보검색
		return  map.get(id);
	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 이름으로 회원정보검색
		int j=0; 
		MemberBean[] temp=new  MemberBean[searchCountByname(name)];
		 for (int i = 0; i < map.size(); i++) {
			if (map.get(i).getName().equals(name)) {
				temp[j]=map.get(i);
				j++;
			}
			
		}
		 	return temp;
		
		/*MemberBean[] tempList=new MemberBean[this.searchCountByname(name)];
		int j=0;
		
		for (int i = 0; i < tempList.length; i++) {
			if (memberList[i].getName().equals(name)) {
				tempList[j]=memberList[i];
			    j++;
			}
		}
		
		return tempList;*/
	}

	@Override
	public String remove(String id) {
		// 회원탈퇴
		String result ="";
		
		return map.remove(id)!=null? "탈퇴성공":"탈퇴실패";
		
	}

	@Override
	public int countAll() {
		// 회원 수 구하기
		return map.size();
	}

	@Override
	public int searchCountByname(String name) {
		// 이름으로 회원 수 세기
		int n=0;
		for (int i = 0; i < map.size(); i++) {
			if (memberList[i].getName().equals(name)) {
				
				n++;
			}
		}
		
		return n;
	}



}
