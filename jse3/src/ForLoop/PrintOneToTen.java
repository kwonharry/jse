package ForLoop;

public class PrintOneToTen {
public static void main(String[] args) {
	// escape 문자 \t =>tab
	
	int odd=0, even=0;
	
	for(int i=1; i<11; i++){
		if(i%2==0){
			even+=i;
		}else{
			odd+=i;
		}
	}

	System.out.println("1부터 10사이의 짝수의 합 :"+even);
	System.out.println("1부터 10사이의 홀수의 합 :"+odd);
}
}
