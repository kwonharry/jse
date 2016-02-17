package SwitchCase;

import java.util.Scanner;

public class Calc {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("숫자 입력");
	int num1=scanner.nextInt();
	
	System.out.println("연산자 입력");
	String opcode ="";
	opcode=scanner.next();
	
	System.out.println("숫자 입력");
	int num2=scanner.nextInt();
	
	int result=0;
	
	switch (opcode) {
	case "+":result=num1+num2; break;
	case "-":result=num1-num2; break;
	case "*":result=num1*num2; break;
	case "/":result=num1/num2; break;
	case "%":result=num1%num2; break;
		
	default:System.out.println("연산기호를 정확하게 입력해 주세요!");break;
	}
	
	System.out.println(num1+opcode+num2+"="+result);
}
}
