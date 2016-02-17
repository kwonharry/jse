package OOP;

import java.util.Scanner;

public class DateServiceImpl implements DateService{

	@Override
	public String getEndDateOfMonth(int month) {
	
		int end=30;
		String result="";
		
		switch (month) {
		case 1: case 3: case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			end=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			end=30;
			break;
		case 2:
			end=29;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		result=month+"월의 마지막 날은"+end+"일입니다.";
		return result;
		
	} 

}
