package List;

public class DescTotal {
	public int compare(GradeBean front, GradeBean back){
		
		return (front.getTotal()>back.getTotal())? -1: (front.getTotal()<back.getTotal())? 1:0;
			
	}
}
