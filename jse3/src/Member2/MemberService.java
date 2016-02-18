package Member2;

public interface MemberService {
	public String login(String id,String pass);
	public String Update(MemberBean member);
	public String join(MemberBean member);
	public MemberBean searchById(String id);
	public MemberBean[] searchByName(String name);
	public String remove(String id);
	public int countAll();
	public int searchCountByname(String name);

}
