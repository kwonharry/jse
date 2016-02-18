package List;

import java.util.List;

public interface GradeService {
	public void input(GradeBean grade);
	public List<GradeBean> getList();
	public GradeBean searchByHak(String hak);
	public List<GradeBean> searchByName(String name);
	//List 계열을 사용하는 이유: 순서를 정할 수 있다
	public void descGradeByTotal();
	public List<GradeBean> ascGradeByName();
	
	
}
