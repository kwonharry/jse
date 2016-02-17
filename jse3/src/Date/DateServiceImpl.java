package Date;


public class DateServiceImpl implements DateService {

	@Override
	public int getEndDayOfMonth(int year, int month) {
		

		int end=30;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: end=31;break;
		
		case 4: case 6: case 9: case 11: end=30; break;
		
		case 2: 
			end=(year%4==0 && (year%100!=0 || year%400==0))?  29:28;
			break;
		
		default: System.out.println("잘못입력하셨습니다."); break;
		}
		
		

	

	return end;
}

}
