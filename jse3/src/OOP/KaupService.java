



package OOP;

public interface KaupService {
	//메소드 중에 블록이 존재하지 않고 이름과 파라미터와 리턴타입만 정의된 것을 
	//추상 메소드라고 한다.
	//이에 대비하여 블록이 정의된 것은 구상 메소드라고 한다.
	public String getState(double height, double weight);
}
