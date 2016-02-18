package List;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	List<GradeBean> vec;
	public GradeServiceImpl(){
		
	vec=new Vector<GradeBean>();
	}
	
	@Override
	public void input(GradeBean grade){
		vec.add(grade);
	}
	
	
	

	@Override
	public List<GradeBean> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeBean searchByHak(String hak) {
		GradeBean grade= new GradeBean();
		for (int i = 0; i < vec.size(); i++) {
			if(vec.get(i).getHak().equals(hak)){
				grade=vec.get(i);
			}
		}
		return grade;
	}

	@Override
	public List<GradeBean> searchByName(String name) {
		//이름으로 찾기
		List<GradeBean> temp= new Vector<GradeBean>();
		for (int i = 0; i < vec.size(); i++) {
			
			if(vec.get(i).getName().equals(name)){
				temp.add(vec.get(i));
				
			}
		}
		return temp;
	}

	@Override
	public void descGradeByTotal() {
//총점으로 성적순 내림차순 정렬(총점이 높은 순서대로 정렬) 98,97,60,40		
	
	DescTotal desc=new DescTotal();
	for (int i = 0; i < vec.size(); i++) {
		for (int j = 0; j < vec.size(); j++) {
			desc.compare(vec.get(i), vec.get(j));
		}
	}

	}

	@Override
	public List<GradeBean> ascGradeByName() {
		//  이름 순으로 오름차순 정렬 ㄱ,ㄴ,ㄷ..
	
		AscName asc=new AscName();
		Collections.sort(vec,asc);
		return vec;
	}

}
