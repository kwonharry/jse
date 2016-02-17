package OOP;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateService service = new DateServiceImpl();

		System.out.println("몇 월달입니까?");
		int month = scanner.nextInt();

		String result = service.getEndDateOfMonth(month);
		System.out.println(result);
	}
}
