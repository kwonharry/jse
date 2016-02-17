package OOP;

import java.util.Scanner;

public class KaupMain {
	/*
	 * 키를 입력하세요
	 * height
	 * 몸무게를 입력하세요
	 * weight
	 * 카우푸 인덱스
	 * index = (몸무게/ (키*키))*10000
	 * index>30 비만
	 * >24 과체중
	 * >20 정상
	 * >15 저체중
	 * >13 마름
	 * >10영양실조
	 * 소모증
	 * */
	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	KaupService service = new KaupServiceImpl();
	//클래스타입 인스턴스(과제)= new 생성자
	System.out.println("이름을 입력하세요");
	String name=scanner.next();
	System.out.println("키를 입력하세요");
	double height=scanner.nextDouble();
	System.out.println("몸무게를 입력하세요");
	double weight=scanner.nextDouble();
	String result= service.getState(height,weight);
	
	System.out.println(name+"님은 "+result+"입니다.");
	}
}
