package ForLoop;

public class FactorOfs {
/* 
 * [결과]
 * 1에서 100까지의 정수에서 
 * 5의 배수의 갯수는 몇개냐?
 * 5의 배수의 합?
 * 
 * */
	public static void main(String[] args) {
		int sum=0, count=0;
		int i=0;
		for(i=1;i<=100;i++){
			if(i%5==0){
				count++;
				sum+=i;
			}
		}
		
		System.out.println("5의 배수의 갯수는? "+count);
		System.out.println("5의 배수의 합은? "+sum);
	}

}

