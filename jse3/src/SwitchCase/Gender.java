package SwitchCase;

import java.util.Scanner;

public class Gender {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("이름?");
	String name= scanner.next();
	System.out.println("주민번호?");
	String ssn=scanner.next();
	char index=ssn.charAt(7);
	System.out.println(index);
	
	String gender="";
	switch (index) {
	case '1':case 3:
		gender="남자";
		break;
	case 2:case 4:
		gender="여자";
		break;
	case 5:case 6:
		gender="외국인";
		break;
	default:
		System.out.println("잘못된 주민번호입니다.");
		break;
	}
   System.out.println(name+"은 "+gender+"입니다.");
}
}
