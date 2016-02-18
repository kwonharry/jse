package List;

import java.util.Comparator;

public class AscName implements Comparator<GradeBean> {

	@Override
	public int compare(GradeBean front, GradeBean back) {
		// 기준점 앞과 뒤를 비교하여 오름차순 정렬
		return front.getName().compareTo(back.getName());
	}


}
